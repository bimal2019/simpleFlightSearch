import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './root.component.html',
  styleUrls: ['./root.component.css']
})
export class RootComponent implements OnInit {
  form;
  response:any;
 

  constructor(private formBuilder: FormBuilder, private http: HttpClient) { }

  ngOnInit() {
    this.form = this.formBuilder.group({
      flightNumber:[''],
      origin: ['',[Validators.required]],
      destination: ['',[Validators.required]],
      date: ['',[Validators.required]]
    });
  }

  onSubmit(){


    if(this.form.valid){
      
     return this.http.get('http://localhost:8090/simpleflightsearch'+'/'+'/'+this.form.value.flightNumber+'/'+this.form.value.origin+'/'+this.form.value.destination+'/'+this.form.value.date)
     .subscribe((response)=>{
         this.response = response;
        console.log(response);
      })
     
    }
  }

}
