import React from 'react';
import { useNavigate } from 'react-router-dom';
import Navbar from '../../components/navbar';
import Footer from '../../components/footer';

import './business.css';

export default function Business() {
  const navigate = useNavigate();
  
  return (
    <div className="business-container">
  
      <div className="business-content">
        <h1>Business Services</h1>
        {/* Add your business-specific content here */}
      </div>
  
    </div>
  );
}