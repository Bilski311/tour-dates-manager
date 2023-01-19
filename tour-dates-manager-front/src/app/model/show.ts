import { Time } from "@angular/common";

export class Show {
    constructor(
        public city: string,
        public venue: string,
        public showDate: Date,
        public showTime: Time,
        public ticketPrice: number
    ) {}
}
