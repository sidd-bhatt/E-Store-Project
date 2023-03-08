import React from 'react'
import './Header.css';

export default function Header() {
  return (
  <>
    <div id="headdiv">
        <h1>GIFT STORE</h1>
    </div>
    <div id="navdiv">
        <nav>
            <a class="navAncher" href="/">HOME</a>
            <a class="navAncher" href="about.html">ABOUT</a>
            <a class="navAncher" href="categories.html">CATEGORIES</a>
            <a class="navAncher" href="allgifts.html">ALL GIFTS</a>
            <a class="navAncher" href="/Registration">REGISTER</a>
            <a class="navAncher" href="login.html">LOGIN</a>
            <a class="navAncher" href="contact.html">CONTACT</a>
            <a class="navAncher" href="kart.html">KART</a>
    </nav>
    </div>
    </>
  )
}
