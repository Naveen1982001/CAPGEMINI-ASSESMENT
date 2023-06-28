import { TestBed } from '@angular/core/testing';

import { PlacementmanagementService } from './placementmanagement.service';

describe('PlacementmanagementService', () => {
  let service: PlacementmanagementService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(PlacementmanagementService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
