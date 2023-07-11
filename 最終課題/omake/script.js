'use strict'

let zibun_kazu = '1';
let imageNo = '1';
let judgement_youso = null;

/*掛け金を決定するときの処理*/
function kakekin_kettei() {
	const str = document.getElementById("kakekin").value;

	document.getElementById("genzai_kakekin").textContent = str;
}

/*大きいか小さいのボタンを押したときの処理*/
function game_start() {
	const zibun_toranpu = document.getElementById('zibun_toranpu');
	const banotoranpu = document.getElementById('banotoranpu');
	const images = ['../images/hart1.png','../images/hart1.png','../images/hart2.png','../images/hart3.png','../images/hart4.png','../images/hart5.png','../images/hart6.png','../images/hart7.png','../images/hart8.png','../images/hart9.png','../images/hart10.png','../images/hart11.png','../images/hart12.png','../images/hart13.png'];
	zibun_toranpu.src = banotoranpu.src;

	zibun_kazu = imageNo;
	let zibunnokazu = document.getElementById('zibun_kazu').textContent;
	document.getElementById('zibun_kazu').textContent = zibun_kazu;


	imageNo = 1 + Math.floor( Math.random() * 13);
	banotoranpu.src = images[imageNo];
	let banokazu = document.getElementById('banokazu').textContent;
	document.getElementById('banokazu').textContent = imageNo;
}


function game_start_up() {
	game_start();
	judgement_youso = document.getElementById('up').textContent;
	judgement();
}

function game_start_down() {
	game_start();
	judgement_youso = document.getElementById('down').textContent;
	judgement();
}

/*勝敗を決め報酬金を与える処理*/
function judgement() {
	if (zibun_kazu >= imageNo) {
		if (judgement_youso === "大きい") {
			let genzai_kakekin = document.getElementById("genzai_kakekin").textContent;
			console.log(genzai_kakekin);
			genzai_kakekin = genzai_kakekin * 2;
			let haisyutukinn = document.getElementById('haisyutukinn').textContent;
			document.getElementById('haisyutukinn').textContent = genzai_kakekin;
		} else {

		}
	} else if (judgement_youso === "小さい"){
		const kakekin_kettei = 2 * document.getElementById("kakekin_kettei").textContent;
		let haisyutukinn = document.getElementById('haisyutukinn').textContent;
		document.getElementById('haisyutukinn').textContent = kakekin_kettei;
	}
}