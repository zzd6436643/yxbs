package org.jzw.yxbs.utils;

public class EscapeStringUtil {
	//对于mysql数据库，只有查询条件中有like这种查询的时候需要做这个转义，这是mysql底层实现的缺陷，其他数据库请先做验证（已知oracle不需要做这个转义）
	//add by zhangzhide 20130614
	public static String escape4mysql(String str){
		if(str==null){
			return null;
		}else{
			return str.replaceAll("\\\\", "\\\\\\\\").replaceAll("%","\\\\%").replaceAll("_", "\\\\_");
		}
	}
}
