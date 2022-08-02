function executeSubmit() {
	    var name = document.getElementById(`seiName`).value;
	    if ( name == `` ) {
		       alert(`氏名を入力してください`);
		       return;
		}
		console.log(name);
		document.forms[0].submit();
		return;       			
}

$(function(){
	      // ここにプログラムを記述
	      $(`#num-input`).on(`input`, function() {
		        console.log(`test1`);
		      // 半角変換
		      var halfVal = $(this).val().replace(/[ !-~]/g,
		          function (impStr) {
			          // 文字コードをシフト
			          return String.fromCharCode(impStr.charCodeAt(0) - 0xFEE0);
			      }
			  );
			//数字以外の不要な文字を削除
			$(this).val(halfVal.replace(/[^0-9]/g, ``));
	      });
});

	      