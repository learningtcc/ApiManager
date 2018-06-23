package cn.crap.enumer;

public enum SettingType {
	IMAGE("图片"),TEXT("文本"),COLOR("颜色"),FONTFAMILY("字体"),INDEXPAGE("首页地址"),ICONFONT("图标库");
	private final String name;
	
	public static String getName(String value){
		try{
			return SettingType.valueOf(value).getName();
		}catch(Exception e){
			return "";
		}
	}
	private SettingType(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public String getValue(){
		return this.name();
	}
}
