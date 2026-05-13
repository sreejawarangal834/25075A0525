import React from 'react';
import { Link } from 'react-router-dom';
import './Home.css';

const Home = () => {
  return (
    <div className="home-container">
      <div className="hero-section">
        <div className="hero-content">
          <h1>Student Management System</h1>
          <p>Streamline your educational institution with our comprehensive management solution</p>
          <div className="hero-buttons">
            <Link to="/register" className="btn btn-primary">Get Started</Link>
            <Link to="/about" className="btn btn-secondary">Learn More</Link>
          </div>
        </div>
      </div>

      <div className="features-section">
        <div className="features-container">
          <h2>Why Choose Our System?</h2>
          <div className="features-grid">
            <div className="feature-item">
              <div className="feature-icon">🚀</div>
              <h3>Easy to Use</h3>
              <p>Intuitive interface designed for educators and administrators</p>
            </div>
            <div className="feature-item">
              <div className="feature-icon">📈</div>
              <h3>Track Progress</h3>
              <p>Monitor student performance and academic achievements in real-time</p>
            </div>
            <div className="feature-item">
              <div className="feature-icon">🔒</div>
              <h3>Secure Platform</h3>
              <p>Enterprise-grade security to protect sensitive student data</p>
            </div>
            <div className="feature-item">
              <div className="feature-icon">📱</div>
              <h3>Mobile Friendly</h3>
              <p>Access the system from any device, anywhere, anytime</p>
            </div>
          </div>
        </div>
      </div>

      <div className="cta-section">
        <div className="cta-content">
          <h2>Ready to Transform Your Institution?</h2>
          <p>Join thousands of educational institutions already using our platform</p>
          <Link to="/register" className="btn btn-primary btn-large">Register Now</Link>
        </div>
      </div>
    </div>
  );
};

export default Home;
