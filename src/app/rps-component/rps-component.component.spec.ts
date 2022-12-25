import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RpsComponentComponent } from './rps-component.component';

describe('RpsComponentComponent', () => {
  let component: RpsComponentComponent;
  let fixture: ComponentFixture<RpsComponentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RpsComponentComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(RpsComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
