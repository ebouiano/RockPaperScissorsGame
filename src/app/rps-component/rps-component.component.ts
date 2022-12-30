import { HttpClient } from '@angular/common/http';
import { Component, Injectable, OnInit } from '@angular/core';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-rps-component',
  template: `
    <div>
      <button (click)="play('rock')">Rock</button>
      <button (click)="play('paper')">Paper</button>
      <button (click)="play('scissors')">Scissors</button>
    </div>
    <div *ngIf="result">
      You played {{ result.player }}, the computer played {{ result.computer }}.
      <div *ngIf="result.winner === 'player'">You won!</div>
      <div *ngIf="result.winner === 'computer'">The computer won.</div>
      <div *ngIf="result.winner === 'draw'">It's a draw.</div>
    </div>
  `,
  templateUrl: './rps-component.component.html',
  styleUrls: ['./rps-component.component.scss']
})
export class RpsComponentComponent implements OnInit {

  
  result: Result = {
    player: '',
    computer: '',
    winner: ''
  };

  constructor(private api: ApiService) {}

  ngOnInit() {}

  play(symbol: string) {
    this.api.play(symbol).subscribe(result => {
      if(this.result){
      this.result = result;}
    });
  }
  see(){
    this.api.see();
  }
}

@Injectable({
  providedIn: 'root'
})
export class ApiService {
  url = "http://localhost:8080";  
  constructor(private http: HttpClient) {}

  play(symbol: string): Observable<Result> {
    return this.http.post<Result>(`${this.url}/api/play`, { player: symbol });
  }
  see(): Observable<Result> {
    return this.http.get<Result>(`${this.url}/api`);
  }
}

export interface Result {
  player: string,
  computer: string,
  winner: string
}