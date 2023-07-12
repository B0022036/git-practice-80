'use strict'

let zibun_kazu = '1';
let imageNo = '1';
let judgement_youso = null;
let syakin = 'no';

/*掛け金を決定するときの処理*/
function kakekin_kettei() {
	const str = document.getElementById("kakekin").value;

	document.getElementById("genzai_kakekin").textContent = str;
}

/*大きいか小さいのボタンを押したときの処理*/
function game_start() {
	let syozikin = Number(document.getElementById('syozikin').textContent);
	let genzai_kakekin = Number(document.getElementById('genzai_kakekin').textContent);
	if (syozikin >= genzai_kakekin) {
		let syozikin = document.getElementById('syozikin').textContent;
		document.getElementById('syozikin').textContent = syozikin - document.getElementById("genzai_kakekin").textContent;

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
		syakin = 'no';
	} else {
		window.alert('借金はだめですよ！（所持金が足りません）');
		syakin = 'yes';
	}	
}

/*大きいか小さいのボタンを押したときの処理*/
function game_start_up() {
	game_start();
	if (syakin !== "yes") {
		judgement_youso = document.getElementById('up').textContent;
		judgement_up();
	}
}

function game_start_down() {
	game_start();
	if (syakin !== "yes") {
		judgement_youso = document.getElementById('down').textContent;
		judgement_down();
	}
}

/*勝敗を決め報酬金を与える処理*/
function judgement_up() {
	if (zibun_kazu <= imageNo) {
		let genzai_kakekin = document.getElementById("genzai_kakekin").textContent;
		genzai_kakekin = genzai_kakekin * 2;
		document.getElementById('haisyutukinn').textContent = genzai_kakekin;
		let haisyutukinn = Number(document.getElementById('haisyutukinn').textContent);
		let syozikin = Number(document.getElementById('syozikin').textContent);
		document.getElementById('syozikin').textContent = syozikin + haisyutukinn;
	} else {
		let haisyutukinn = document.getElementById('haisyutukinn').textContent;
		document.getElementById('haisyutukinn').textContent = 0;
	}
}

function judgement_down() {
	if (zibun_kazu > imageNo) {
		let genzai_kakekin = document.getElementById("genzai_kakekin").textContent;
		genzai_kakekin = genzai_kakekin * 2;
		document.getElementById('haisyutukinn').textContent = genzai_kakekin;
		let haisyutukinn = Number(document.getElementById('haisyutukinn').textContent);
		let syozikin = Number(document.getElementById('syozikin').textContent);
		document.getElementById('syozikin').textContent = syozikin + haisyutukinn;
	} else {
		let haisyutukinn = document.getElementById('haisyutukinn').textContent;
		document.getElementById('haisyutukinn').textContent = 0;
	}
}
