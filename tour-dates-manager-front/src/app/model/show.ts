import { Time } from "@angular/common";

export class Show {
    constructor(
        public city: string,
        public venue: string,
        public date: Date,
        public time: Time
    ) {}
}
