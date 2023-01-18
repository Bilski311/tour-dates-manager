import { Component, OnInit } from '@angular/core';
import { Subscription } from 'rxjs';
import { Show } from 'src/app/model/show';
import { ShowService } from 'src/app/service/show.service';
import { ShowsTableComponent } from "../shows-table/shows-table.component";
import { SearchShowsFormComponent } from "../search-shows-form/search-shows-form.component";
import { MatDialog, MatDialogRef } from '@angular/material/dialog';
import { CreateShowModalComponent } from '../create-show-modal/create-show-modal.component';

@Component({
    standalone: true,
    selector: 'app-admin-panel',
    templateUrl: './admin-panel.component.html',
    styleUrls: ['./admin-panel.component.scss'],
    imports: [ShowsTableComponent, SearchShowsFormComponent]
})
export class AdminPanelComponent implements OnInit {
  showsSubscription: Subscription = new Subscription;
  shows: Show[] = [];
  dialogRef!: MatDialogRef<CreateShowModalComponent>;

  constructor(private showService: ShowService, public matDialog: MatDialog) {}

  ngOnInit(): void {
    this.showsSubscription = this.showService.getShows().subscribe(next => {
      this.shows = next;
    })
  }

  openModal(): void {
    this.dialogRef = this.matDialog.open(CreateShowModalComponent);
    this.dialogRef.afterClosed().subscribe(() => this.onSubmit());
  }

  onSubmit(): void {
    console.log('Update the table here');
  }
}
