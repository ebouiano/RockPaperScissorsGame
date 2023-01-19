import { HttpClient } from '@angular/common/http';
import { Component, Injectable, OnInit } from '@angular/core';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-rps-component',
  template: ``,
  templateUrl: './rps-component.component.html',
  styleUrls: ['./rps-component.component.scss'],
})

/**
 * Class representing a component for playing rock-paper-scissors.
 * @implements {OnInit}
 */
export class RpsComponentComponent implements OnInit {
  /** The current game result */
  result: Result = {
    player: '',
    computer: '',
    winner: '',
  };

  /**
   * Creates an instance of RpsComponentComponent.
   * @param {ApiService} api - The API service to use for making requests.
   */
  constructor(private api: ApiService) {}

  /**
   * A lifecycle hook that is called after the component is initialized.
   * @return {void}
   */
  ngOnInit() {}

  /**
   * Makes a POST request to the API to play a round of rock-paper-scissors.
   * @param {string} symbol - The player's symbol (rock, paper, or scissors).
   * @return {void}
   */
  play(symbol: string) {
    this.api.play(symbol).subscribe((result) => {
      if (this.result) {
        this.result = result;
      }
    });
  }
}

/**
 * Class representing an API service.
 * @decorator {Injectable}
 */
@Injectable({
  providedIn: 'root',
})
export class ApiService {
  /** Base URL for the API */
  url = 'http://localhost:8080';

  /**
   * Creates an instance of ApiService.
   * @param {HttpClient} http - The HTTP client to make requests with.
   */
  constructor(private http: HttpClient) {}

  /**
   * Makes a POST request to the API to play a round of rock-paper-scissors.
   * @param {string} symbol - The player's symbol (rock, paper, or scissors).
   * @return {Observable<Result>} - An observable of the game result.
   */
  play(symbol: string): Observable<Result> {
    return this.http.post<Result>(`${this.url}/api/play`, { player: symbol });
  }

  /**
   * Makes a GET request to the API. This method is for debug purposes.
   * @return {Observable<Result>} - An observable of the API response.
   */
  see(): Observable<Result> {
    return this.http.get<Result>(`${this.url}/api`);
  }
}

/**
 * Interface representing a rock-paper-scissors game result.
 */
export interface Result {
  /** The player's symbol (rock, paper, or scissors) */
  player: string;
  /** The computer's symbol (rock, paper, or scissors) */
  computer: string;
  /** The winner of the game (player, computer, or draw) */
  winner: string;
}
