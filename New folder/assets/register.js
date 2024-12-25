// register.js

document.addEventListener("DOMContentLoaded", () => {
    const registerForm = document.getElementById("register-form");

    // Form validation and submission
    registerForm.addEventListener("submit", (e) => {
        e.preventDefault();

        // Get form values
        const firstName = document.getElementById("firstName").value;
        const lastName = document.getElementById("lastName").value;
        const email = document.getElementById("email").value;
        const password = document.getElementById("password").value;

        // Basic validation
        if (firstName === "" || lastName === "" || email === "" || password === "") {
            alert("Please fill in all fields.");
            return;
        }

        if (password.length < 6) {
            alert("Password must be at least 6 characters long.");
            return;
        }

        // Simulate successful registration
        alert("Registration successful!");
        window.location.href = "login.html";
    });

    // Email and password validation feedback
    const emailInput = document.getElementById("email");
    const passwordInput = document.getElementById("password");

    emailInput.addEventListener("input", validateForm);
    passwordInput.addEventListener("input", validateForm);

    function validateForm() {
        if (emailInput.value === "") {
            emailInput.classList.add("is-invalid");
        } else {
            emailInput.classList.remove("is-invalid");
        }

        if (passwordInput.value.length < 6) {
            passwordInput.classList.add("is-invalid");
        } else {
            passwordInput.classList.remove("is-invalid");
        }
    }
});
