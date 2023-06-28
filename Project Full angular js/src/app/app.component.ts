import { Component } from '@angular/core';
import { PlacementmanagementService } from './placementmanagement.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

 
  title = 'placementmanagement';
  
  placementDetails = null as any;
  placementToUpdate = {
    id:"",
    name:"",
    college:"",
    qualification:"",
    year:""
  
  }

  constructor(private placementmanagementService: PlacementmanagementService ) {  
    this.readplacementDetails();
  }

  register(registerForm:NgForm){
    this.placementmanagementService.placement(registerForm.value).subscribe(
      (resp)=>{
      console.log(resp);
      registerForm.reset();
      this.readplacementDetails();
    },
    (err) => {
      console.log(err);
    }
    );
  
  }

  
  readplacementDetails(){
    this.placementmanagementService.readplacement().subscribe(
      (resp) =>{
         console.log(resp);
         this.placementDetails=resp;
              },
      (err)=>{
         console.log(err);
              }
      );
  }

  deleteplacement(placement: { id: any })
  {
    this.placementmanagementService.deleteplacement(placement.id).subscribe(
       (resp)=>{
        console.log(resp);
        this.readplacementDetails();
       },
       (err)=>
       {
        console.log(err);
       }

    )
    
  }
  edit(placement:any){
    this.placementToUpdate=placement;
  }

  updateplacement(){
    this.placementmanagementService.updateplacement(this.placementToUpdate).subscribe(
      (resp) => {
        console.log(resp);
      },
      (err) => {
        console.log(err);
      }
    );
  }
   
   
}






