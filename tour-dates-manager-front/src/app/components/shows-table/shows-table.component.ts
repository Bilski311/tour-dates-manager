import { CommonModule } from '@angular/common';
import { ArrayType } from '@angular/compiler';
import { Component, Input } from '@angular/core';
import { Show } from 'src/app/model/show';

@Component({
  standalone: true,
  imports: [CommonModule],
  selector: 'app-shows-table',
  templateUrl: './shows-table.component.html',
  styleUrls: ['./shows-table.component.scss']
})
export class ShowsTableComponent {
  @Input()
  shows: Show[] = [];
}
