package org.jzw.yxbs.utils;

import org.apache.log4j.Logger;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 日期处理工具类
 * 
 * @author
 */
public class DateFormatUtil {

	private static final Logger LOGGER = Logger.getLogger(DateFormatUtil.class);

	/**
	 * 将格式为yyyy-MM-dd格式的字符串转化成日期
	 * 
	 * @param datestr
	 *            传入字符串
	 * @return 转化后的日期
	 */
	public static Date StringToDate(String datestr) {
		if (datestr == null) {
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			return sdf.parse(datestr);
		} catch (ParseException e) {
			LOGGER.error(e);
			return null;
		}
	}

	/**
	 * 将传入的字符串按照指定的格式转化成字符串
	 * 
	 * @param datestr
	 *            传入字符串
	 * @param format
	 *            指定的格式
	 * @return 转化后的日期
	 */
	public static Date StringToDate(String datestr, String format) {
		if (datestr == null) {
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		try {
			return sdf.parse(datestr);
		} catch (ParseException e) {
			LOGGER.error(e);
			return null;
		}
	}

	/**
	 * 日期格式化输出
	 * 
	 * @param date
	 *            日期
	 * @param format
	 *            格式
	 * @return 输出后的字符传
	 */
	public static String dateToString(Date date, String format) {
		if (date == null) {
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(date);
	}

	/**
	 * 
	 * @param date
	 * @return
	 */
	public static String dateToString(Date date) {
		if (date == null) {
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(date);
	}

	/**
	 * 获得增加一天的日期
	 * 
	 * @param date
	 *            当前日期
	 * @return 计算后的日期
	 */
	public static Date getTomorrow(Date date) {
		if (date == null) {
			return null;
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, 1);
		return cal.getTime();
	}

	/**
	 * 获取到日期 根据指定的年、月、日 时分秒均为0
	 * 
	 * @param year
	 *            年
	 * @param month
	 *            月
	 * @param day
	 *            日
	 * @return 获得指定年月日的日期
	 */
	public static Date getDate(int year, int month, int day) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month, day, 0, 0, 0);
		return cal.getTime();
	}

	/**
	 * 
	 * @param dateStr
	 * @param date
	 * @return 获得下一个月指定的日期
	 */
	public static Date getNextMonth(String dateStr, int date) {
		if (dateStr == null) {
			return null;
		}
		Date displayDate = StringToDate(dateStr);
		Calendar cal = Calendar.getInstance();
		cal.setTime(displayDate);
		cal.add(Calendar.MONTH, 1);
		cal.set(Calendar.DATE, date);
		return cal.getTime();
	}

	/**
	 * 
	 * @param date
	 * @return
	 */
	public static Date getYesterday(Date date) {
		if (date == null) {
			return null;
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, -1);
		return cal.getTime();
	}
	
}
