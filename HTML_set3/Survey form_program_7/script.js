function validateForm() {
    const mobileInput = document.getElementById('mobile');
    const mobileError = document.getElementById('mobileError');
    const mobilePattern = /^\d{10}$/; 

    if (!mobilePattern.test(mobileInput.value)) {
        mobileError.textContent = 'Please enter a valid 10-digit mobile number.';
        return false;
    } else {
        mobileError.textContent = '';
    }
    displayPopup();
    resetForm();
    return false;
}

function displayPopup() {
    document.getElementById('popupFirstName').innerText = document.getElementById('firstName').value;
    document.getElementById('popupLastName').innerText = document.getElementById('lastName').value;
    document.getElementById('popupDOB').innerText = document.getElementById('dob').value;
    document.getElementById('popupCountry').innerText = document.getElementById('country').value;
    document.getElementById('popupGender').innerText = getSelectedGenders();
    document.getElementById('popupProfession').innerText = document.getElementById('profession').value;
    document.getElementById('popupEmail').innerText = document.getElementById('email').value;
    document.getElementById('popupMobile').innerText = document.getElementById('mobile').value;

    document.getElementById('popup').style.display = 'block';
}

function getSelectedGenders() {
    const genders = document.getElementsByName('gender');
    const selectedGenders = [];
    genders.forEach(gender => {
        if (gender.checked) {
            selectedGenders.push(gender.value);
        }
    });
    return selectedGenders.join(', ');
}

function closePopup() {
    document.getElementById('popup').style.display = 'none';
    resetForm();
}

function resetForm() {
    document.getElementById('surveyForm').reset();
}
