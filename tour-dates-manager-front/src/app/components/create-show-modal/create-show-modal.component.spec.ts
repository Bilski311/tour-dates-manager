import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreateShowModalComponent } from './create-show-modal.component';

describe('CreateShowModalComponent', () => {
  let component: CreateShowModalComponent;
  let fixture: ComponentFixture<CreateShowModalComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CreateShowModalComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CreateShowModalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
