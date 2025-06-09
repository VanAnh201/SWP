import React from 'react';
import { Link } from 'react-router-dom';
import Logo from '../assets/lalagoLogo.png';
import '../css/footer.css';

const Footer = () => {
  return (
    <footer className="footer">
      <div className="footer-content">
        <div className="footer-logo">
          <img src={Logo} alt="Lalago" />
        </div>
        <div className="footer-info">
          <p>HONG KONG LALAGO COMPANY</p>
          <p>Địa chỉ: AAAAAAAAAAAAAA</p>
          <p>Điện thoại: (84) 00 000 9999</p>
          <p>Email: support@lalago.com</p>
        </div>
      </div>
    </footer>
  );
};

export default Footer;