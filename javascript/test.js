let element=document.getElementsByClassName("kadai");

let star=`<span>★</span>`;

let star2=`<span>☆</span>`
	
for(var i=0; i<5 ; i++){
	element[0].insertAdjacentHTML("beforeend",star);
}


for(var i=1; i<=25 ; i++){
	if(i % 5 === 0 && i % 2 === 0){
		element[1].insertAdjacentHTML("beforeend",`<span>★<br></span>`);
	}else if(i % 5 === 0 && i % 2 !== 0){
		element[1].insertAdjacentHTML("beforeend",`<span>☆<br></span>`)	
	}else if(i % 2 === 0){
		element[1].insertAdjacentHTML("beforeend",star);
	}else{
		element[1].insertAdjacentHTML("beforeend",star2);
	}
}


let drink_name;
let drink_price;
let zankin

let pay=document.getElementById("pay");
let drink_select=document.getElementById("menu");
let output=document.getElementById("output")

function buttonclick(){
	switch (drink_select.value){
			case "coffee":
				drink_name="コーヒー";
				drink_price=150;
				break;
			case "green-tea":
				drink_name="お茶";
				drink_price=130;
				break;
			case "orange":
				drink_name="オレンジジュース";
				drink_price=160;
				break;
			case "water":
				drink_name="水";
				drink_price=100;
				break;
	}
	
	if(pay.value < drink_price){
		output.textContent="お金が足りません";
	}else{
		zankin=pay.value-drink_price;
		output.innerHTML=drink_name+"を購入しました。"+"<br>"+"おつりは"+zankin+"円です。";
	}
}

let buy=document.getElementById("buy");

buy.addEventListener('click',buttonclick);


let pay2=document.getElementById("pay2");

let buyable_drink=document.getElementsByName("drink");

function Number(){
	const Num = pay2.value;

	if(Num >= 100 && Num < 130){
		buyable_drink[0].disabled=true;
		buyable_drink[1].disabled=true;
		buyable_drink[2].disabled=true;
		buyable_drink[3].disabled=false;
	}else if(Num >= 130 && Num < 150){
		buyable_drink[0].disabled=true;
		buyable_drink[1].disabled=false;
		buyable_drink[2].disabled=true;
		buyable_drink[3].disabled=false;
	}else if(Num >= 150 && Num < 160){
		buyable_drink[0].disabled=false;
		buyable_drink[1].disabled=false;
		buyable_drink[2].disabled=true;
		buyable_drink[3].disabled=false;
	}else if(Num >= 160){
		buyable_drink[0].disabled=false;
		buyable_drink[1].disabled=false;
		buyable_drink[2].disabled=false;
		buyable_drink[3].disabled=false;
	}else{
		buyable_drink[0].disabled=true;
		buyable_drink[1].disabled=true;
		buyable_drink[2].disabled=true;
		buyable_drink[3].disabled=true;
	}
}

pay2.onchange=Number;

let D_price;
let D_name;
let zankin2

let output2=document.getElementById("output2")

function purchase(){
	const Num = pay2.value;
	
	if(buyable_drink[0].checkde){
		D_price=150;
		D_name="コーヒー";
	}else if(buyable_drink[1].checked){
		D_price=130;
		D_name="お茶";
	}else if(buyable_drink[2].checked){
		D_price=160;
		D_name="オレンジジュース";
	}else if(buyable_drink[3].checked){
		D_price=100;
		D_name="水";
	}
	
	zankin2=Num-D_price;
	output2.innerHTML=D_name+"を購入しました。"+"<br>"+"おつりは"+zankin2+"です。";
		
}

document.getElementById("purchase").addEventListener('click',purchase);