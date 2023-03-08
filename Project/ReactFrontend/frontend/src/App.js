import './App.css';
import React from "react";
import './Components/Header.css';
import {
  BrowserRouter as Router,
  Routes,
  Route,
  Link
} from "react-router-dom";
import Header from './Components/Header.js';
import Rform from './Components/Rform';
import Home from './Components/Home';

function App() {
  return (
    <>
    <Header />
    <Router>
      <Routes>
        <Route path='/' element={<Home/>}/>
        <Route path='/Registration' element={<Rform/>}/>
      </Routes>
    </Router>
    </>
  );
}

export default App;
