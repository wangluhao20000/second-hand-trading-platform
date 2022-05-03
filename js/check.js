function isNotEmpty(elem, msg) {
	var str = elem.value;
	if (str == null || str.length == 0) {
		alert(msg);
		elem.focus();
		return false;
	} else {
		return true;
	}
}
function checkUsernameFormat(elem) {
	var strValidChars = "0123456789_abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	var strChar;
	var blnResult = true;
	var str = elem.value;
	str = str.toString();
	if(!isNotEmpty(elem,'�û�������Ϊ�գ�'))
		return false;
	if (elem.value.length < 3 || elem.value.length > 16) {
		alert("�û������ȱ������3,С��16��");
		elem.focus();
		return false;
	}
	for (i = 0; i < str.length && blnResult == true; i++) {
		strChar = str.charAt(i);
		if (strValidChars.indexOf(strChar) == -1) {
			blnResult = false;
		}
	}
	if (!blnResult) {
		alert('�û�����ʽ����ȷ��');
		elem.focus();
	}
	return blnResult;
}
function isNumeric(elem, msg) {
	var strValidChars = "0123456789";
	var strChar;
	var Result = true;
	var str = elem.value;
	str = str.toString();
	if (str.length == 0) {
		Result = false;
	}
	for (i = 0; i < str.length && Result == true; i++) {
		strChar = str.charAt(i);
		if (strValidChars.indexOf(strChar) == -1) {
			Result = false;
		}
	}
	if (!Result) {
		alert(msg);
		elem.focus();
	}
	return Result;
}
function isEmail(elem) {
	if (elem.value.indexOf("@") != -1 && elem.value.indexOf(".") != -1) {
		return true;
	} else {
		alert("\u90ae\u4ef6\u5730\u5740\u65e0\u6548\uff0c\u8bf7\u91cd\u65b0\u586b\u5199\uff01");
		elem.focus();
		return false;
	}
}
function post_check(f)
{
	if(!isNotEmpty(f.message_title,'���ⲻ��Ϊ�գ�'))
		return false;
	if(!isNumeric(f.price,'�۸�ֻ�������֣�'))
		return false;
	if(!isEmail(f.r_email))
		return false;
	if(!isNotEmpty(f.r_user,'��ϵ�˲���Ϊ�գ�'))
		return false;
	if(!isNotEmpty(f.r_phone,'��ϵ��ʽ����Ϊ�գ�'))
		return false;
	if(!isNotEmpty(f.message_desc,'��Ʒ��鲻��Ϊ�գ�'))
		return false;
	if (f.message_desc.value.length < 10) {
		alert("��Ʒ�������10���֣�");
		return false;
	}
	return true;
}
function reg_check(f)
{
	if(!checkUsernameFormat(f.username))
		return false;
	if(!isNumeric(f.stu_id,'ѧ�Ÿ�ʽ����ȷ��'))
		return false;
	if(!isEmail(f.email))
		return false;
	if(f.repassword.value != f.password.value)
	{
		alert('������������벻��ͬ��');
		f.repassword.value="";
		f.password.value="";
		f.password.focus();
		return false;
	}
	if(!isNotEmpty(f.question, '�����ѯ���ⲻ��Ϊ�գ�'))
		return false;
	if(!isNotEmpty(f.answer, '�����ѯ�𰸲���Ϊ�գ�'))
		return false;
	return true;
}
