import { ComponentFixture, TestBed } from '@angular/core/testing';
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';
import {HttpClientModule} from '@angular/common/http';

import { ApiService } from './rps-component.component';



describe('ApiService', () => {

  beforeEach(() => TestBed.configureTestingModule({
    imports: [HttpClientTestingModule], 
    providers: [ApiService]
  }));

   it('should be created', () => {
    const service: ApiService = TestBed.get(ApiService);
    expect(service).toBeTruthy();
   });

   it('should have get function', () => {
    const service: ApiService = TestBed.get(ApiService);
    expect(service.play).toBeTruthy();
   });

});
