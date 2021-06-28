import logo from './logo.svg';
import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import LoadingIndicatorComponent from "./common/loader/loading-indicator-component";
import AppNotificationComponent from "./common/notifications/app-notification-component";
import ChooseService from "./choose-service-slot/ChooseService";

function App() {
    return (
        <div>
            <LoadingIndicatorComponent></LoadingIndicatorComponent>
            <nav className="navbar navbar-expand-md navbar-dark bg-dark fixed-top">
                <a className="navbar-brand" href="/">Ar Salon & Day Spa</a>
            </nav>
            <main role="main" className="container">
                <div className="padding-container">
                    <ChooseService></ChooseService>
                </div>
            </main>
            <AppNotificationComponent></AppNotificationComponent>
        </div>
    );
}

export default App;
