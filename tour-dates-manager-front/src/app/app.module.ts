import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { NoopAnimationsModule } from '@angular/platform-browser/animations';
import { ShowsTableComponent } from './components/shows-table/shows-table.component';
import { SearchShowsFormComponent } from './components/search-shows-form/search-shows-form.component';
import { AdminPanelComponent } from './components/admin-panel/admin-panel.component';
import { CommonModule } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';
import { MatDialogModule } from '@angular/material/dialog';
import { MatNativeDateModule } from '@angular/material/core';

@NgModule({
    declarations: [
        AppComponent
    ],
    providers: [],
    bootstrap: [AppComponent],
    imports: [
        BrowserModule,
        AppRoutingModule,
        NgbModule,
        NoopAnimationsModule,
        CommonModule,
        ShowsTableComponent,
        SearchShowsFormComponent,
        AdminPanelComponent,
        HttpClientModule,
        MatDialogModule,
        MatNativeDateModule
    ]
})
export class AppModule { }
