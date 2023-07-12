'use strict'

window.alert('おいでませ山口！！！');

window.onload = function() {
	const list = ["大吉", "吉", "中吉", "小吉", "末吉", "凶", "大凶"];

	document.getElementById("omikuzi_button").onclick = function() {
		var random = Math.floor(Math.random() * list.length);
		document.getElementById("omikuzi_kekka").textContent = list [random];
	}
}