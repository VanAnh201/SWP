import React, { useState } from 'react';
import { useNavigate } from 'react-router-dom';
import './Landing.css';
import backgroundImg from '../../assets/background.jpg';
import logo from '../../assets/lalagoLogo.png';

const vehicleData = {
  bike: {
    name: 'Xe máy',
    specs: {
      'Trọng tải': '25 kg',
      'Kích cỡ hàng hóa tối đa': '42cm x 28cm x 28cm',
      'Phù hợp cho': 'Giao đồ ăn trực tuyến, đồ nhỏ, thực phẩm, tài liệu',
      'Lưu ý': 'Phí điểm dừng được tính theo từng điểm và có thể khác nhau',
    },
  },
  van500: {
    name: 'Xe tải 500kg',
    specs: {
      'Trọng tải': '500 kg',
      'Kích cỡ hàng hóa tối đa': '150cm x 100cm x 100cm',
      'Phù hợp cho': 'Hàng hóa vừa, thực phẩm, đồ gia dụng',
    },
  },
  truck1: {
    name: 'Xe tải 1 tấn',
    specs: {
      'Trọng tải': '1000 kg',
      'Kích cỡ hàng hóa tối đa': '280cm x 160cm x 160cm',
      'Phù hợp cho': 'Hàng hóa lớn, nội thất, thiết bị',
    },
  },
  truck15: {
    name: 'Xe tải 1.5 tấn',
    specs: {
      'Trọng tải': '1500 kg',
      'Kích cỡ hàng hóa tối đa': '300cm x 160cm x 160cm',
      'Phù hợp cho': 'Hàng hóa cồng kềnh, vật liệu xây dựng',
    },
  },
  truck2: {
    name: 'Xe tải 2 tấn',
    specs: {
      'Trọng tải': '2000 kg',
      'Kích cỡ hàng hóa tối đa': '320cm x 180cm x 180cm',
      'Phù hợp cho': 'Hàng hóa nặng, container nhỏ',
    },
  },
  truck25: {
    name: 'Xe tải 2.5 tấn',
    specs: {
      'Trọng tải': '2500 kg',
      'Kích cỡ hàng hóa tối đa': '350cm x 180cm x 180cm',
      'Phù hợp cho': 'Hàng hóa siêu nặng, vận chuyển công nghiệp',
    },
  },
};

function Landing() {
  const [selectedVehicle, setSelectedVehicle] = useState(null);
  const navigate = useNavigate();

  const handleVehicleClick = (key) => {
    setSelectedVehicle((prev) => (prev === key ? null : key));
  };

  const handlePersonalClick = () => {
    navigate('/personal');
  };

  const handleBusinessClick = () => {
    navigate('/business');
  };

  return (
    <div className="landing-container">
      {/* Hero Section */}
      <div
        className="hero"
        style={{
          background: `linear-gradient(90deg, rgba(0,0,0,0.7) 0%, rgba(0,0,0,0) 100%), url(${backgroundImg})`,
          backgroundSize: 'cover',
          backgroundPosition: 'center',
        }}
      >
        <div className="hero-content">
          <h1>Giao hàng siêu tốc</h1>
          <p>Nền tảng giao hàng theo yêu cầu.</p>
          <p>Đặt là có xe trong 30 giây.</p>
          <button className="delivery-btn">Giao hàng ngay</button>
        </div>
      </div>

      {/* Service Cards */}
      <div className="service-cards">
        <div className="service-card" onClick={handleBusinessClick}>
          <div className="icon business"></div>
          <h3>Doanh nghiệp</h3>
          <p>Giải pháp giao hàng hỗ trợ nhanh chóng cho công việc kinh doanh của bạn</p>
          <button>Tìm hiểu thêm →</button>
        </div>
        <div className="service-card" onClick={handlePersonalClick}>
          <div className="icon personal"></div>
          <h3>Cá nhân</h3>
          <p>Dễ dàng đặt đơn giao hàng nhanh chóng nhờ kết nối với tài xế gần nhất</p>
          <button>Tìm hiểu thêm →</button>
        </div>
        <div className="service-card">
          <div className="icon driver"></div>
          <h3>Tài xế</h3>
          <p>Công việc giao hàng với Lalago: tạo thêm thu nhập, chủ động thời gian</p>
          <button>Đăng ký ngay →</button>
        </div>
      </div>

      {/* Vehicle Types Section */}
      <div className="vehicle-section">
        <h2>Phương tiện vận chuyển phù hợp với mức giá tốt nhất</h2>
        <div className="vehicle-grid">
          {Object.entries(vehicleData).map(([key, vehicle]) => (
            <div
              key={key}
              className={`vehicle-type ${selectedVehicle === key ? 'selected' : ''}`}
              onClick={() => handleVehicleClick(key)}
            >
              <p>{vehicle.name}</p>
            </div>
          ))}
        </div>

        {selectedVehicle && (
          <div className="vehicle-details">
            <h3>{vehicleData[selectedVehicle].name}</h3>
            <div className="specs">
              {Object.entries(vehicleData[selectedVehicle].specs).map(([key, value]) => (
                <div key={key} className="spec-item">
                  <strong>{key}:</strong>
                  <span>{value}</span>
                </div>
              ))}
            </div>
          </div>
        )}
      </div>

    
        
    </div>
  );
}

export default Landing;