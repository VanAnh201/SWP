// src/pages/auth/login.js
import { useNavigate } from 'react-router-dom';
import React, { useState } from 'react';
import './login.css';
import logo from '../../assets/lalagoLogo.png';
import authenImg from '../../assets/authenpic.jpg'; // Adjust the path as needed 

function Login() {
  const [formData, setFormData] = useState({
    email: '',
    password: '',
  });

  const [loading, setLoading] = useState(false);
  const navigate = useNavigate(); // ✅ Add this line

  const handleChange = (e) => {
    setFormData((prev) => ({
      ...prev,
      [e.target.name]: e.target.value,
    }));
  };

  const handleSubmit = async (e) => {
    e.preventDefault();
    setLoading(true);
    try {
      const response = await fetch('http://localhost:3000/login', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(formData),
      });

      const data = await response.json();
      console.log('Đăng nhập thành công:', data);
      // TODO: Redirect or save token
    } catch (error) {
      console.error('Đăng nhập không thành công:', error);
    } finally {
      setLoading(false);
    }
  };

  // ✅ Handle register click
  const handleRegisterClick = () => {
    navigate('/register');
  };

  return (
    <div className="login-container">
      
      <div className="login-right">
        <form className="login-form" onSubmit={handleSubmit}>
          <img src={logo} alt="Logo" className="logo" />

          <input
            type="email"
            name="email"
            placeholder="Phone number or email"
            value={formData.email}
            onChange={handleChange}
            required
          />
          <input
            type="password"
            name="password"
            placeholder="Password"
            value={formData.password}
            onChange={handleChange}
            required
          />
          <div className="forgot">Forgot password?</div>
          <button type="submit" disabled={loading} className="login-button">
            {loading ? 'Logging in...' : 'Log In'}
          </button>

          <div className="divider">Or</div>

          <button type="button" className="social-button fb">Continue with Facebook</button>
          <button type="button" className="social-button google">Continue with Google</button>

          <p className="footer-text">
            New to Lalago?{' '}
            <span className="register-link" onClick={handleRegisterClick}>
              Create a free account
            </span>
          </p>
          <p className="policy-links">Terms & Conditions · Privacy Policy</p>
        </form>
      </div>
    </div>
  );
}

export default Login;