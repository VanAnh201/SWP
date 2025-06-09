// src/pages/auth/register.js
import React, { useState } from 'react';
import './register.css';
import logo from '../../assets/lalagoLogo.png';

function Register() {
  const [formData, setFormData] = useState({
    fullName: '',
    email: '',
    phone: '',
    password: '',
    confirmPassword: '',
    receiveOffers: false,
  });

  const [loading, setLoading] = useState(false);
  const [error, setError] = useState('');

  const handleChange = (e) => {
    const { name, value, type, checked } = e.target;
    setFormData((prev) => ({
      ...prev,
      [name]: type === 'checkbox' ? checked : value,
    }));
  };

  const handleSubmit = async (e) => {
    e.preventDefault();
    setError('');

    if (formData.password !== formData.confirmPassword) {
      setError('Mật khẩu và xác nhận mật khẩu không khớp.');
      return;
    }

    setLoading(true);
    try {
      const response = await fetch('http://localhost:3000/api/Auth/register', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(formData),
      });

      const data = await response.json();
      console.log('Đăng ký thành công:', data);
      // TODO: redirect or show success notification
    } catch (err) {
      console.error('Đăng ký thất bại:', err);
      setError('Đã xảy ra lỗi khi đăng ký. Vui lòng thử lại.');
    } finally {
      setLoading(false);
    }
  };

  return (
    <div className="register-container">
      
      <div className="register-right">
        <form className="register-form" onSubmit={handleSubmit}>
          <img src={logo} alt="Logo" className="logo" />
          <h2>Create a free account</h2>

          {error && <div className="error-msg">{error}</div>}

          <div className="phone-group">
            <select className="country-code">
              <option value="+84">+84</option>
              <option value="+66">+66</option>
            </select>
            <input
              type="tel"
              name="phone"
              placeholder="Phone number"
              value={formData.phone}
              onChange={handleChange}
              required
            />
          </div>

          <input
            type="email"
            name="email"
            placeholder="Email (optional)"
            value={formData.email}
            onChange={handleChange}
          />

          <input
            type="password"
            name="password"
            placeholder="Password (min 6 characters)"
            value={formData.password}
            onChange={handleChange}
            required
          />

          <input
            type="password"
            name="confirmPassword"
            placeholder="Confirm Password"
            value={formData.confirmPassword}
            onChange={handleChange}
            required
          />

          <label className="checkbox-label">
  <input
    type="checkbox"
    name="receiveOffers"
    checked={formData.receiveOffers}
    onChange={handleChange}
  />
  <span>
    I'd like to receive offers and promotions from Lalago. I've read and agreed to the Direct Marketing terms in the
    <span className="link"> Privacy Policy</span>.
  </span>
</label>


          <button type="submit" className="register-button" disabled={loading}>
            {loading ? 'Signing up...' : 'Sign Up for Free'}
          </button>

          <div className="divider">Or</div>

          <button type="button" className="social-button fb">Continue with Facebook</button>
          <button type="button" className="social-button google">Continue with Google</button>
        </form>
      </div>
    </div>
  );
}

export default Register;