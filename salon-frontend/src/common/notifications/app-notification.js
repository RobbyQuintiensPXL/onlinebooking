import {Subject} from 'rxjs';

const subject = new Subject();

export const appNotification = {
    showSucces: (message, title = "Information") => subject.next({title, message, "variant": 'success'}),
    showError: (message) => subject.next({title: "Error ", message, "variant": 'danger'}),
    onChange: () => subject.asObservable()
};
