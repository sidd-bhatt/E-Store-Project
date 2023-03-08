import React, { useState } from 'react'
import './Rform.css';
import axios from 'axios';

export default function Rform() {

  const [firstname, setfname] = useState("");
  const [lastname, setlname] = useState("");
  const [email, setemail] = useState("");
  const [mobile, setmobile] = useState("");
  const [password, setpass] = useState("");
  const [role, setrole] = useState("");

  async function handlesubmit(event) {
    event.preventDefault();
    try {
      await axios.post("https://localhost:8080/register/addUser",
        {
          firstname: firstname,
          lastname: lastname,
          email: email,
          mobile: mobile,
          password: password,
          role: role
        });
      alert("user registration Successfull");
      setfname("");
      setlname("");
      setemail("");
      setmobile("");
      setpass("");
      setrole("");
    }
    catch {
      alert("User registration Failed");
    }
  }

  return (
    <div id="shopkeeper">
      <form onSubmit={handlesubmit} method="post">
        <input
          type="text"
          name="firstName"
          id="firstName"
          placeholder='Enter First Name'
          onChange={(event) => {
            setfname(event.target.value);
          }}
        />
        <br /> <br />
        <input
          type="text"
          name="lastName"
          id="lastName"
          placeholder='Enter Last Name'
          onChange={(event) => {
            setlname(event.target.value);
          }}
        /> <br /> <br />
        <input
          type="email"
          name="email"
          id="email"
          placeholder='Enter Email'
          onChange={(event) => {
            setemail(event.target.value);
          }}
        /> <br /> <br />
        <input
          type="text"
          name="mobile"
          id="mobile"
          placeholder='Enter Mobile Number'
          onChange={(event) => {
            setmobile(event.target.value);
          }}
        /> <br /> <br />
        <input
          type="password"
          name="password"
          id="password"
          placeholder='Enter Your Password'
          onChange={(event) => {
            setpass(event.target.value);
          }}
        /> <br /> <br />
        <label htmlFor="">Select Your Role</label>
        <select name="role" id="role"
          onChange={(event) => {
            setrole(event.target.value);
          }}
        >
          <option value=""></option>
          <option value="CUSTOMER">Customer</option>
          <option value="SHOPKEEPER">Shopkeeper</option>
        </select> <br /> <br />
        <button type="submit">SUBMIT</button>
      </form>
    </div>
  )
}
