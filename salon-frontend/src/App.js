import React from 'react';
import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import LoadingIndicatorComponent from "./common/loader/loading-indicator-component";
import AppNotificationComponent from "./common/notifications/app-notification-component";
import ChooseService from "./choose-service-slot/ChooseService";
import {Route, Switch} from "react-router";
import ChooseSlot from "./choose-service-slot/ChooseSlot";
import {BrowserRouter as Router} from "react-router-dom";

function App() {
    return (
        <Router>
            <div>
                <LoadingIndicatorComponent/>
                <nav className="navbar navbar-expand-md navbar-dark bg-dark fixed-top">
                    <a className="navbar-brand" href="/">Ar Salon & Day Spa</a>
                </nav>
                <main role="main" className="container">
                    <div className="padding-container">

                        <Switch>
                            <Route exact path="/" component={ChooseService}>

                            </Route>
                            <Route path="/chooseslot/:serviceId/:serviceName"  component={ChooseSlot}>
                            </Route>
                            <Route>

                                <ChooseService />
                            </Route>
                        </Switch>


                    </div>
                </main>
                <AppNotificationComponent/>
            </div></Router>
    );
}

export default App;
