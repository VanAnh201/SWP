import React from 'react';
import { Link, useNavigate } from 'react-router-dom';
import Logo from '../assets/lalagoLogo.png';
import '../css/navbar.css';

function Navbar() {
  const navigate = useNavigate(); // ✅ useNavigate hook

  const handleLoginClick = () => {
    navigate('/login'); // ✅ go to /login route
  };

  const handleRegisterClick = () => {
    navigate('/register'); // you can change this if you have register page
  };

  return (
    <div className='navbar'>
      <div className='leftside'>
        <Link to="/">
          <img src={Logo} alt="Lalago Logo" />
        </Link>
        <a href="#">Giao Hàng</a>
        <a href="#">Di Chuyển</a>
        <a href="#">Tài Xế</a>
        <a href="#">Ưu Đãi</a>
        <a href="#">Về Lalago</a>
      </div>
      <div className='rightside'>
        <button className="login-btn" onClick={handleLoginClick}>Đăng nhập</button>
        <button className="register-btn" onClick={handleRegisterClick}>Đăng ký</button>
      </div>
    </div>
  );
}

export default Navbar;