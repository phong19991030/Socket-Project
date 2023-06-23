import React, { useState } from "react";
import { UserService } from "../service/UserService";
import { useNavigate } from "react-router-dom";
import { Cookies, useCookies } from "react-cookie";

export default function Login() {
  const [user, setUser] = useState<any>();

  const [isValid, setIsvalid] = useState<boolean>();

  const navigate = useNavigate();

  const handleChangeField = (event: any) => {
    let field = event.target.name;
    let value = event.target.value;

    setUser({ ...user, [field]: value });
  };

  const checkUser = () => {
    UserService.getInstance()
      .checkUser(user)
      .then((respone) => {
        debugger;
        respone.data.checkUser == true
          ? gotoChat(respone.data.user)
          : setIsvalid(true);
      });
  };

  const gotoChat = (user: any) => {
    navigate("/chat");
    const cookies = new Cookies();
    cookies.set("user", user, { path: "/" });
  };

  return (
    <>
      <input
        type="text"
        onChange={handleChangeField}
        name="userName"
        placeholder="user"
      />
      <input
        type="text"
        onChange={handleChangeField}
        name="password"
        placeholder="password"
      />
      <button onClick={checkUser}>Login</button>
      <p hidden={!isValid}>Wrong user or password</p>
    </>
  );
}
