import { ComponentFixture, TestBed } from '@angular/core/testing';
import { SearchShowsFormComponent } from './search-shows-form.component';

describe('SearchShowsFormComponent', () => {
  let component: SearchShowsFormComponent;
  let fixture: ComponentFixture<SearchShowsFormComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SearchShowsFormComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SearchShowsFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
