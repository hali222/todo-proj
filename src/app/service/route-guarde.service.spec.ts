import { TestBed } from '@angular/core/testing';

import { RouteGuardeService } from './route-guarde.service';

describe('RouteGuardeService', () => {
  let service: RouteGuardeService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(RouteGuardeService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
