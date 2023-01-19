import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormsModule, ReactiveFormsModule } from '@angular/forms';
import { MatDialogRef } from '@angular/material/dialog';
import { ShowService } from 'src/app/service/show.service';
import { MatDatepickerModule } from '@angular/material/datepicker';
import { MatFormFieldModule } from '@angular/material/form-field';
import { CommonModule } from '@angular/common';
import { MatInputModule } from '@angular/material/input';
import { CityService } from 'src/app/service/city.service';


@Component({
  standalone: true,
  imports: [
    MatDatepickerModule,
    MatFormFieldModule,
    FormsModule,
    CommonModule, 
    MatInputModule,
    ReactiveFormsModule
  ],
  selector: 'app-create-show-modal',
  templateUrl: './create-show-modal.component.html',
  styleUrls: ['./create-show-modal.component.scss']
})
export class CreateShowModalComponent implements OnInit {
  cities: string[] = [];
  createShowForm = this.formBuilder.group({
    city: null,
    venue: null,
    showDate: null,
    showTime: null,
    ticketPrice: null
  });

  constructor(
    private showService: ShowService,
    private formBuilder: FormBuilder,
    private dialogRef: MatDialogRef<CreateShowModalComponent>,
    private cityService: CityService) {
  }

  ngOnInit() {
    this.cityService.getCities().subscribe(next => this.cities = next.map(city => city.name));
  }

  onSubmit(): void {
    const request = this.createShowForm.value;
    this.showService.createShow(request).subscribe();
    this.dialogRef.close();
  }
}
