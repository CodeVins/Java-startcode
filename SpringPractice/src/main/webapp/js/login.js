window.addEventListener('load', function() {
	// 로그인 이벤트
	var loginButton = document.querySelector('#loginBtn');
	loginButton.addEventListener('click', function(event) {
		event.preventDefault();
		validateForm();
	});
});

function validateForm() {
	var username = document.querySelector('#email').value;
	var password = document.querySelector('#password').value;

	// email
	var emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
	if (!emailRegex.test(username)) {
		alert('Email형식으로 입력해 주세요.');
		return;
	}

	// パスワード
	if (password.length < 6) {
		alert('패스워드는 6자리 이상으로 입력해 주세요.');
		return;
	}
	
	document.querySelector('#loginForm').submit();
}