import React, { useState } from 'react';
import { useNavigate } from 'react-router-dom';
import './Personal.css';
import deliveryImg from '../../assets/delivery.webp';
import movingImg from '../../assets/moving.webp';

const vehicleData = {
  bike: {
    name: 'Xe máy',
    specs: {
      'Trọng tải': '25 kg',
      'Kích cỡ hàng hóa tối đa': '42cm x 28cm x 28cm',
      'Phù hợp cho': 'Giao đồ ăn trực tuyến, đồ nhỏ, thực phẩm, tài liệu',
      'Lưu ý': 'Phí điểm dừng được tính theo từng điểm và có thể khác nhau'
    }
  },
  van500: {
    name: 'Xe tải 500kg',
    specs: {
      'Trọng tải': '500 kg',
      'Kích cỡ hàng hóa tối đa': '150cm x 100cm x 100cm',
      'Phù hợp cho': 'Hàng hóa vừa, thực phẩm, đồ gia dụng'
    }
  },
  truck1: {
    name: 'Xe tải 1 tấn',
    specs: {
      'Trọng tải': '1000 kg',
      'Kích cỡ hàng hóa tối đa': '280cm x 160cm x 160cm',
      'Phù hợp cho': 'Hàng hóa lớn, nội thất, thiết bị'
    }
  },
  truck15: {
    name: 'Xe tải 1.5 tấn',
    specs: {
      'Trọng tải': '1500 kg',
      'Kích cỡ hàng hóa tối đa': '300cm x 160cm x 160cm',
      'Phù hợp cho': 'Hàng hóa cồng kềnh, vật liệu xây dựng'
    }
  },
  truck2: {
    name: 'Xe tải 2 tấn',
    specs: {
      'Trọng tải': '2000 kg',
      'Kích cỡ hàng hóa tối đa': '320cm x 180cm x 180cm',
      'Phù hợp cho': 'Hàng hóa nặng, container nhỏ'
    }
  },
  truck25: {
    name: 'Xe tải 2.5 tấn',
    specs: {
      'Trọng tải': '2500 kg',
      'Kích cỡ hàng hóa tối đa': '350cm x 180cm x 180cm',
      'Phù hợp cho': 'Hàng hóa siêu nặng, vận chuyển công nghiệp'
    }
  }
};

function Personal() {
  const [selectedVehicle, setSelectedVehicle] = useState(null);
  const [selectedService, setSelectedService] = useState(null);
  const navigate = useNavigate();

  const deliveryFeatures = [
    {
      icon: "🚚",
      title: "Đến sáng ngày khi bạn cần",
      description: "Dịch vụ xe đang có sẵn để giao gửi ngay tại địa phương, có thể sử dụng để giao hàng trong ngày hoặc giao ngay lập tức."
    },
    {
      icon: "📦",
      title: "Đội ngũ tài xế chuyên nghiệp",
      description: "Các tài xế được tuyển chọn kỹ càng và đào tạo chuyên nghiệp để đảm bảo chất lượng."  // Added missing closing quote and period
    },
    {
      icon: "📱",
      title: "Tiện kiện theo dõi và cập nhật",
      description: "Theo dõi đơn hàng trực tuyến, cập nhật trạng thái theo thời gian thực."
    },
    {
      icon: "💰",
      title: "Giá cả cạnh tranh",
      description: "Mức giá phù hợp với chất lượng dịch vụ và cam kết không phát sinh chi phí."
    }
  ];

  const whyChooseFeatures = [
    {
      icon: "🚗",
      title: "Đến sáng ngày khi bạn cần",
      description: "Dịch vụ xe đang có sẵn để giao gửi ngay tại địa phương, có thể sử dụng để giao hàng trong ngày."
    },
    {
      icon: "👥",
      title: "Đội ngũ tài xế chuyên nghiệp",
      description: "Các tài xế được tuyển chọn kỹ càng và đào tạo chuyên nghiệp để đảm bảo dịch vụ tốt nhất."
    },
    {
      icon: "✨",
      title: "Tiện kiện theo dõi và cập nhật",
      description: "Theo dõi đơn hàng trực tuyến, cập nhật trạng thái theo thời gian thực."
    },
    {
      icon: "💰",
      title: "Giá cả cạnh tranh",
      description: "Mức giá phù hợp với chất lượng dịch vụ và cam kết không phát sinh chi phí."
    }
  ];

  const services = [
    {
      title: "Hàng nhỏ",
      icon: "📦"
    },
    {
      title: "Hàng lớn và công kềnh",
      icon: "🚛"
    },
    {
      title: "Hàng có giá trị hoặc dễ vỡ",
      icon: "💎"
    },
    {
      title: "Khi cần chuyển nhà, văn phòng",
      icon: "🏠"
    },
    {
      title: "Giao đồ ăn và các thực phẩm khác",
      icon: "🍽️"
    }
  ];

  const serviceDetails = {
    "Hàng nhỏ": {
      description: "Tài liệu và hàng hóa nhỏ gọn nhẹ, dễ cầm nắm khi di chuyển và vận chuyển.",
    },
    "Hàng lớn và công kềnh": {
      description: "Vận chuyển đồ nội thất, thiết bị lớn và các loại hàng hóa cồng kềnh khác.",
    },
    "Hàng có giá trị hoặc dễ vỡ": {
      description: "Đảm bảo an toàn cho các mặt hàng dễ vỡ và có giá trị cao trong quá trình vận chuyển.",
    },
    "Khi cần chuyển nhà, văn phòng": {
      description: "Dịch vụ chuyển nhà trọn gói, an toàn và chuyên nghiệp.",
    },
    "Giao đồ ăn và các thực phẩm khác": {
      description: "Giao đồ ăn nhanh chóng, đảm bảo nhiệt độ và chất lượng.",
    }
  };

  const handleVehicleClick = (key) => {
    if (selectedVehicle === key) {
      setSelectedVehicle(null);
    } else {
      setSelectedVehicle(key);
    }
  };

  return (
    <div className="landing-container">
      {/* Hero Section */}
      <div className="hero">
        <div className="hero-content">
          <div className="hero-logo">
            
          </div>
          <h1>Giao hàng theo mọi nhu cầu</h1>
          <p>Đồ hàng nhỏ hay hàng to cồng kềnh, bạn đều dễ dàng đặt đơn giao hàng nhanh chóng tới kết nối với tài xế gần nhất.</p>
          <button className="order-btn">Đặt giao ngay</button>
        </div>
      </div>

      {/* Why Choose Section */}
      <section className="why-choose-section">
        <div className="content-wrapper">
          <h2>Tại sao nên lựa chọn Lalago?</h2>
          <h3>Đối tác giao hàng tin cậy của bạn</h3>
          <div className="features-grid">
            <div className="features-image">
              <img src={deliveryImg} alt="Delivery Partner" />
            </div>
            <div className="features-content">
              <div className="feature-item">
                <div className="icon-wrapper">👤</div>
                <div className="text-wrapper">
                  <h4>Đến sáng ngày khi bạn cần</h4>
                  <p>Dịch vụ xe đang có sẵn để giao gửi ngay tại địa phương</p>
                </div>
              </div>
              <div className="feature-item">
                <div className="icon-wrapper">🚚</div>
                <div className="text-wrapper">
                  <h4>Đội ngũ tài xế chuyên nghiệp</h4>
                  <p>Các tài xế được tuyển chọn kỹ càng và đào tạo chuyên nghiệp</p>
                </div>
              </div>
              <div className="feature-item">
                <div className="icon-wrapper">📱</div>
                <div className="text-wrapper">
                  <h4>Tiện kiện theo dõi và cập nhật</h4>
                  <p>Theo dõi đơn hàng trực tuyến và cập nhật trạng thái</p>
                </div>
              </div>
              <div className="feature-item">
                <div className="icon-wrapper">💰</div>
                <div className="text-wrapper">
                  <h4>Giá cả cạnh tranh</h4>
                  <p>Mức giá phù hợp với chất lượng dịch vụ</p>
                </div>
              </div>
            </div>
          </div>
        </div>
      </section>

      <div className="main-content-wrapper">
        {/* Moving Service Section */}
        <div className="moving-service">
          <div className="content-wrapper">
            <div className="moving-content">
              <h2>Chuyển nhà dễ dàng cùng Lalago</h2>
              <ul>
                <li>Đăng ký lịch lái xe trong bất kỳ đối tượng phương tiện trọn gói của chúng tôi</li>
                <li>Giảm thiểu thời gian chờ với dịch vụ giao hàng nhanh chóng</li>
                <li>Giá cả phải chăng và minh bạch cho mọi dịch vụ</li>
              </ul>
              <button className="learn-more">Tìm hiểu ngay tại đây</button>
            </div>
            <div className="moving-image">
              <img src={movingImg} alt="Moving Service" />
            </div>
          </div>
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

      <section className="delivery-features">
        <h2>Tại sao nên lựa chọn Lalago?</h2>
        <h3>Đối tác giao hàng tin cậy của bạn</h3>
        <div className="features-container">
          <div className="feature-box">
            <div className="feature-icon">🚚</div>
            <h3 className="feature-title">Đến sáng ngày khi bạn cần</h3>
            <p className="feature-description">
              Dịch vụ xe đang có sẵn để giao gửi ngay tại địa phương, có thể sử dụng để giao hàng trong ngày hoặc giao ngay lập tức.
            </p>
          </div>

          <div className="feature-box">
            <div className="feature-icon">👥</div>
           
            <p className="feature-description">
              Các tài xế được tuyển chọn kỹ càng và đào tạo chuyên nghiệp để đảm bảo dịch vụ tốt nhất.
            </p>
          </div>

          <div className="feature-box">
            <div className="feature-icon">📱</div>
           
            <p className="feature-description">
              Theo dõi đơn hàng trực tuyến, cập nhật trạng thái theo thời gian thực.
            </p>
          </div>

          <div className="feature-box">
            <div className="feature-icon">💰</div>
            
            <p className="feature-description">
              Mức giá phù hợp với chất lượng dịch vụ và cam kết không phát sinh chi phí.
            </p>
          </div>
        </div>
      </section>

      <section className="services-section">
        <h2>Dịch vụ của chúng tôi</h2>
        <div className="services-grid">
          {services.map((service, index) => (
            <div key={index} className="service-wrapper">
              <div 
                className={`service-card ${selectedService === service.title ? 'active' : ''}`}
                onClick={() => setSelectedService(selectedService === service.title ? null : service.title)}
              >
                <div className="service-title">{service.title}</div>
                <div className="service-dot">•</div>
              </div>
              {selectedService === service.title && (
                <div className="service-details">
                  <p>{serviceDetails[service.title].description}</p>
                </div>
              )}
            </div>
          ))}
        </div>
        <button className="service-button">Tìm hiểu ngay</button>
      </section>

      
    </div>
  );
}

export default Personal;