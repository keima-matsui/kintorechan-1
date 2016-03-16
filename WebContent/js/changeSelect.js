menuItem = [	["ケーブルサイドレイズ","ケーブルフロントレイズ"],
			["バタフライマシン","ケーブルクロスオーバー"],
			["ラットプルダウン","シーテッドプーリーロー"],
			["ケーブルクランチ","ロープクランチ"],	
			["ケーブルトライセプスエクステンション","プレスダウン","ケーブルカール"],
			["レッグプレス","レッグエクステンション","レッグカール","カーフレイズオンレッグプレスマシン","ケーブルカール"]	];


function setMenuItem(n)
{
	itemNum = menuItem[n].length;	//　項目数
	
	for (i=0; i<itemNum; i++)
	{
		document.myForm.menu.options[i] = new Option(menuItem[n][i],menuItem[n][i]);
	}
}