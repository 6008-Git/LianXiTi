package d0817;

public class SbAppendToSql {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("SELECT *");
        sb.append("  FROM (SELECT TA.ALARM_DATA_ID,");
        sb.append("               TA.ORG_NO,");
        sb.append("               TO_CHAR(TA.DATA_DATE, 'hh24:mi') AS DATA_DATE,");
        sb.append("               TA.ALARM_TYPE,");
        sb.append("               TA.EMP_NO,");
        sb.append("               TA.ALARM_CONTENT,");
        sb.append("               TA.AUDIT_STATUS,");
        sb.append("               TA.AUDIT_USER,");
        sb.append("               TA.AUDIT_DATE,");
        sb.append("               TA.AUDIT_RESULT,");
        sb.append("               TA.AREA_TYPE,");
        sb.append("               TA.CONS_NO,");
        sb.append("               T.AAA100,");
        sb.append("               T.AAA101,");
        sb.append("               T.AAA102 AS TYPECODE,");
        sb.append("               T.AAA103 AS EVENTTYPE,");
        sb.append("               T.AAA104,");
        sb.append("               TAF.FILE_NAME AS FILENAME,");
        sb.append("               TAF.FILE_ID AS FILEID,");
        sb.append("               TAF.FILE_PATH AS FILEPATH");
        sb.append("          FROM AA10 T, T_ALARM_DATA TA, T_ALARM_DATA_FILE TAF");
        sb.append("         WHERE T.AAA102 = TA.ALARM_TYPE");
        sb.append("           AND TAF.ALARM_DATA_ID = TA.ALARM_DATA_ID");
        sb.append("           AND T.AAA102 = '8'");
        sb.append("           AND TA.ORG_NO = '5010104') TAB1");
        sb.append("  LEFT JOIN (SELECT TA.ALARM_TYPE, COUNT(TA.ALARM_TYPE) AS EVENTCOUNT");
        sb.append("               FROM AA10 T, T_ALARM_DATA TA");
        sb.append("              WHERE T.AAA102 = TA.ALARM_TYPE");
        sb.append("                AND TA.ORG_NO = '5010104'");
        sb.append("              GROUP BY TA.ALARM_TYPE) TAB2");
        sb.append("    ON TAB1.TYPECODE = TAB2.ALARM_TYPE;");
        System.out.println(sb);
    }
}
