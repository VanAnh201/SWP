import React from 'react';
import { Routes, Route, useLocation } from 'react-router-dom';

import Navbar from '../components/navbar';
import Footer from '../components/footer';
import Landing from '../pages/Home/Landing';
import Business from '../pages/Business/business';
import Personal from '../pages/Personal/Personal';
import Login from '../components/login';
// import Register from '../components/register';

export default function MainLayout() {
  const location = useLocation();
  const hideLayoutPaths = ['/login', '/register', '/logout'];
  const shouldHideLayout = hideLayoutPaths.includes(location.pathname);

  return (
    <>
      {!shouldHideLayout && <Navbar />}
      <Routes>
        <Route path="/" element={<Landing />} />
        <Route path="/business" element={<Business />} />
        <Route path="/personal" element={<Personal />} />
        <Route path="/login" element={<Login />} />
        {/* <Route path="/register" element={<Register />} /> */}
      </Routes>
      {!shouldHideLayout && <Footer />}
    </>
  );
}