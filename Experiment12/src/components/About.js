import React from 'react';
import './About.css';

const About = () => {
  return (
    <div className="about-container">
      <div className="about-hero">
        <h1>About Student Management System</h1>
        <p>Empowering education through innovative technology solutions</p>
      </div>

      <div className="about-content">
        <section className="mission-section">
          <h2>Our Mission</h2>
          <p>
            We are dedicated to providing educational institutions with a comprehensive, 
            user-friendly student management system that streamlines administrative processes, 
            enhances communication, and improves the overall educational experience for students, 
            faculty, and administrators.
          </p>
        </section>

        <section className="features-section">
          <h2>Key Features</h2>
          <div className="features-grid">
            <div className="feature-card">
              <div className="feature-icon">📚</div>
              <h3>Academic Management</h3>
              <p>Comprehensive tools for course registration, grade tracking, and academic progress monitoring.</p>
            </div>
            <div className="feature-card">
              <div className="feature-icon">👥</div>
              <h3>Student Services</h3>
              <p>Centralized platform for student registration, profile management, and service requests.</p>
            </div>
            <div className="feature-card">
              <div className="feature-icon">📊</div>
              <h3>Analytics & Reporting</h3>
              <p>Real-time data insights and comprehensive reporting for informed decision-making.</p>
            </div>
            <div className="feature-card">
              <div className="feature-icon">🔐</div>
              <h3>Secure & Reliable</h3>
              <p>Enterprise-grade security with data encryption and regular backups to protect sensitive information.</p>
            </div>
          </div>
        </section>

        <section className="stats-section">
          <h2>Our Impact</h2>
          <div className="stats-grid">
            <div className="stat-item">
              <div className="stat-number">50,000+</div>
              <div className="stat-label">Active Students</div>
            </div>
            <div className="stat-item">
              <div className="stat-number">200+</div>
              <div className="stat-label">Educational Institutions</div>
            </div>
            <div className="stat-item">
              <div className="stat-number">1,000+</div>
              <div className="stat-label">Courses Managed</div>
            </div>
            <div className="stat-item">
              <div className="stat-number">99.9%</div>
              <div className="stat-label">Uptime</div>
            </div>
          </div>
        </section>

        <section className="team-section">
          <h2>Our Team</h2>
          <p>
            Our team consists of experienced educators, software engineers, and education technology 
            experts who are passionate about transforming the educational landscape through innovation.
          </p>
          <div className="team-values">
            <div className="value-item">
              <h3>Innovation</h3>
              <p>Continuously evolving to meet the changing needs of modern education.</p>
            </div>
            <div className="value-item">
              <h3>Excellence</h3>
              <p>Committed to delivering the highest quality solutions and user experience.</p>
            </div>
            <div className="value-item">
              <h3>Support</h3>
              <p>24/7 customer support to ensure smooth operations for all institutions.</p>
            </div>
          </div>
        </section>

        <section className="cta-section">
          <h2>Ready to Transform Your Institution?</h2>
          <p>Join hundreds of educational institutions already using our platform.</p>
          <button className="cta-button">Get Started Today</button>
        </section>
      </div>
    </div>
  );
};

export default About;
