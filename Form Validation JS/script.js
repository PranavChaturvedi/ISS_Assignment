window.addEventListener('DOMContentLoaded', function() {
    const form = document.getElementById('loginForm');
    
    form.addEventListener('submit', function(event) {
      event.preventDefault(); // Prevent form submission
      
      // Get form inputs
      const usernameInput = document.getElementById('username');
      const passwordInput = document.getElementById('password');
      const emailInput = document.getElementById('email');
      const phoneInput = document.getElementById('phone');
      
      // Validate inputs
      const username = usernameInput.value.trim();
      const password = passwordInput.value.trim();
      const email = emailInput.value.trim();
      const phone = phoneInput.value.trim();
      
      if (username === '') {
        alert('Please enter a username.');
        usernameInput.focus();
        return;
      }
      
      if (password === '') {
        alert('Please enter a password.');
        passwordInput.focus();
        return;
      }
      
      if (email === '') {
        alert('Please enter an email.');
        emailInput.focus();
        return;
      }
      
      // Simple email validation using regular expression
      const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
      if (!emailRegex.test(email)) {
        alert('Please enter a valid email address.');
        emailInput.focus();
        return;
      }
      
      if (phone === '') {
        alert('Please enter a phone number.');
        phoneInput.focus();
        return;
      }
      
      // Simple phone number validation using regular expression
      const phoneRegex = /^\d{10}$/;
      if (!phoneRegex.test(phone)) {
        alert('Please enter a valid 10-digit phone number.');
        phoneInput.focus();
        return;
      }
      
      // Inputs are valid, proceed with further actions
      alert('Login successful!');
    });
  });
  