/*
 * Generated by JasperReports - 3/26/21 8:35 AM
 */
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.fill.*;

import java.util.*;
import java.math.*;
import java.text.*;
import java.io.*;
import java.net.*;

import net.sf.jasperreports.engine.*;
import java.util.*;
import net.sf.jasperreports.engine.data.*;


/**
 *
 */
class TDReportLand_1616718929052_311012 extends JREvaluator
{


    /**
     *
     */
    private JRFillParameter parameter_IS_IGNORE_PAGINATION = null;
    private JRFillParameter parameter_REPORT_CONNECTION = null;
    private JRFillParameter parameter_REPORT_LOCALE = null;
    private JRFillParameter parameter_REPORT_TIME_ZONE = null;
    private JRFillParameter parameter_REPORT_TEMPLATES = null;
    private JRFillParameter parameter_REPORT_MAX_COUNT = null;
    private JRFillParameter parameter_REPORT_SCRIPTLET = null;
    private JRFillParameter parameter_ORDINANCENO = null;
    private JRFillParameter parameter_ORDINANCEDATE = null;
    private JRFillParameter parameter_REPORT_FILE_RESOLVER = null;
    private JRFillParameter parameter_REPORT_FORMAT_FACTORY = null;
    private JRFillParameter parameter_REPORT_PARAMETERS_MAP = null;
    private JRFillParameter parameter_REPORT_RESOURCE_BUNDLE = null;
    private JRFillParameter parameter_REPORT_DATA_SOURCE = null;
    private JRFillParameter parameter_REPORT_CLASS_LOADER = null;
    private JRFillParameter parameter_REPORT_URL_HANDLER_FACTORY = null;
    private JRFillParameter parameter_REPORT_VIRTUALIZER = null;
    private JRFillField field_area = null;
    private JRFillField field_areasqm = null;
    private JRFillField field_specificclass = null;
    private JRFillField field_taxable = null;
    private JRFillField field_assesslevel = null;
    private JRFillField field_marketvalue = null;
    private JRFillField field_classification = null;
    private JRFillField field_actualusecode = null;
    private JRFillField field_classcode = null;
    private JRFillField field_subclass = null;
    private JRFillField field_unitvalue = null;
    private JRFillField field_areatype = null;
    private JRFillField field_assessedvalue = null;
    private JRFillField field_mixedarea = null;
    private JRFillField field_basemarketvalue = null;
    private JRFillField field_areaha = null;
    private JRFillField field_actualuse = null;
    private JRFillVariable variable_PAGE_NUMBER = null;
    private JRFillVariable variable_COLUMN_NUMBER = null;
    private JRFillVariable variable_REPORT_COUNT = null;
    private JRFillVariable variable_PAGE_COUNT = null;
    private JRFillVariable variable_COLUMN_COUNT = null;
    private JRFillVariable variable_TOTALMV = null;
    private JRFillVariable variable_TOTALAV = null;
    private JRFillVariable variable_TOTALAREA = null;
    private JRFillVariable variable_TOTALAREASQM = null;
    private JRFillVariable variable_TOTALAREAHA = null;


    /**
     *
     */
    void customizedInit(
        Map pm,
        Map fm,
        Map vm
        )
    {
        initParams(pm);
        initFields(fm);
        initVars(vm);
    }


    /**
     *
     */
    void initParams(Map pm)
    {
        parameter_IS_IGNORE_PAGINATION = (JRFillParameter)pm.get("IS_IGNORE_PAGINATION");
        parameter_REPORT_CONNECTION = (JRFillParameter)pm.get("REPORT_CONNECTION");
        parameter_REPORT_LOCALE = (JRFillParameter)pm.get("REPORT_LOCALE");
        parameter_REPORT_TIME_ZONE = (JRFillParameter)pm.get("REPORT_TIME_ZONE");
        parameter_REPORT_TEMPLATES = (JRFillParameter)pm.get("REPORT_TEMPLATES");
        parameter_REPORT_MAX_COUNT = (JRFillParameter)pm.get("REPORT_MAX_COUNT");
        parameter_REPORT_SCRIPTLET = (JRFillParameter)pm.get("REPORT_SCRIPTLET");
        parameter_ORDINANCENO = (JRFillParameter)pm.get("ORDINANCENO");
        parameter_ORDINANCEDATE = (JRFillParameter)pm.get("ORDINANCEDATE");
        parameter_REPORT_FILE_RESOLVER = (JRFillParameter)pm.get("REPORT_FILE_RESOLVER");
        parameter_REPORT_FORMAT_FACTORY = (JRFillParameter)pm.get("REPORT_FORMAT_FACTORY");
        parameter_REPORT_PARAMETERS_MAP = (JRFillParameter)pm.get("REPORT_PARAMETERS_MAP");
        parameter_REPORT_RESOURCE_BUNDLE = (JRFillParameter)pm.get("REPORT_RESOURCE_BUNDLE");
        parameter_REPORT_DATA_SOURCE = (JRFillParameter)pm.get("REPORT_DATA_SOURCE");
        parameter_REPORT_CLASS_LOADER = (JRFillParameter)pm.get("REPORT_CLASS_LOADER");
        parameter_REPORT_URL_HANDLER_FACTORY = (JRFillParameter)pm.get("REPORT_URL_HANDLER_FACTORY");
        parameter_REPORT_VIRTUALIZER = (JRFillParameter)pm.get("REPORT_VIRTUALIZER");
    }


    /**
     *
     */
    void initFields(Map fm)
    {
        field_area = (JRFillField)fm.get("area");
        field_areasqm = (JRFillField)fm.get("areasqm");
        field_specificclass = (JRFillField)fm.get("specificclass");
        field_taxable = (JRFillField)fm.get("taxable");
        field_assesslevel = (JRFillField)fm.get("assesslevel");
        field_marketvalue = (JRFillField)fm.get("marketvalue");
        field_classification = (JRFillField)fm.get("classification");
        field_actualusecode = (JRFillField)fm.get("actualusecode");
        field_classcode = (JRFillField)fm.get("classcode");
        field_subclass = (JRFillField)fm.get("subclass");
        field_unitvalue = (JRFillField)fm.get("unitvalue");
        field_areatype = (JRFillField)fm.get("areatype");
        field_assessedvalue = (JRFillField)fm.get("assessedvalue");
        field_mixedarea = (JRFillField)fm.get("mixedarea");
        field_basemarketvalue = (JRFillField)fm.get("basemarketvalue");
        field_areaha = (JRFillField)fm.get("areaha");
        field_actualuse = (JRFillField)fm.get("actualuse");
    }


    /**
     *
     */
    void initVars(Map vm)
    {
        variable_PAGE_NUMBER = (JRFillVariable)vm.get("PAGE_NUMBER");
        variable_COLUMN_NUMBER = (JRFillVariable)vm.get("COLUMN_NUMBER");
        variable_REPORT_COUNT = (JRFillVariable)vm.get("REPORT_COUNT");
        variable_PAGE_COUNT = (JRFillVariable)vm.get("PAGE_COUNT");
        variable_COLUMN_COUNT = (JRFillVariable)vm.get("COLUMN_COUNT");
        variable_TOTALMV = (JRFillVariable)vm.get("TOTALMV");
        variable_TOTALAV = (JRFillVariable)vm.get("TOTALAV");
        variable_TOTALAREA = (JRFillVariable)vm.get("TOTALAREA");
        variable_TOTALAREASQM = (JRFillVariable)vm.get("TOTALAREASQM");
        variable_TOTALAREAHA = (JRFillVariable)vm.get("TOTALAREAHA");
    }


    /**
     *
     */
    Object evaluate(int id)
    {
        Object value = null;

        if (id == 0)
        {
            value = (java.lang.Integer)(new Integer(1));
        }
        else if (id == 1)
        {
            value = (java.lang.Integer)(new Integer(1));
        }
        else if (id == 2)
        {
            value = (java.lang.Integer)(new Integer(1));
        }
        else if (id == 3)
        {
            value = (java.lang.Integer)(new Integer(0));
        }
        else if (id == 4)
        {
            value = (java.lang.Integer)(new Integer(1));
        }
        else if (id == 5)
        {
            value = (java.lang.Integer)(new Integer(0));
        }
        else if (id == 6)
        {
            value = (java.lang.Integer)(new Integer(1));
        }
        else if (id == 7)
        {
            value = (java.lang.Integer)(new Integer(0));
        }
        else if (id == 8)
        {
            value = (java.math.BigDecimal)((((java.lang.Number)field_taxable.getValue()) == 1 ? ((java.math.BigDecimal)field_marketvalue.getValue()) : 0.0));
        }
        else if (id == 9)
        {
            value = (java.math.BigDecimal)(BigDecimal.ZERO);
        }
        else if (id == 10)
        {
            value = (java.math.BigDecimal)(((java.math.BigDecimal)field_assessedvalue.getValue()));
        }
        else if (id == 11)
        {
            value = (java.math.BigDecimal)(BigDecimal.ZERO);
        }
        else if (id == 12)
        {
            value = (java.math.BigDecimal)(((java.math.BigDecimal)field_areasqm.getValue()));
        }
        else if (id == 13)
        {
            value = (java.math.BigDecimal)(((java.math.BigDecimal)field_areasqm.getValue()));
        }
        else if (id == 14)
        {
            value = (java.math.BigDecimal)(((java.math.BigDecimal)field_areaha.getValue()));
        }
        else if (id == 15)
        {
            value = (java.lang.Boolean)(((java.lang.Number)field_taxable.getValue()) == 1);
        }
        else if (id == 16)
        {
            value = (java.math.BigDecimal)(((java.math.BigDecimal)field_marketvalue.getValue()));
        }
        else if (id == 17)
        {
            value = (java.lang.Boolean)(new Boolean(((java.lang.String)field_areatype.getValue()).equalsIgnoreCase("ha") ));
        }
        else if (id == 18)
        {
            value = (java.math.BigDecimal)(((java.math.BigDecimal)field_area.getValue()));
        }
        else if (id == 19)
        {
            value = (java.lang.String)(((java.lang.String)field_classcode.getValue()));
        }
        else if (id == 20)
        {
            value = (java.lang.String)(((java.lang.String)field_actualusecode.getValue()));
        }
        else if (id == 21)
        {
            value = (java.lang.Boolean)(new Boolean(((java.lang.String)field_areatype.getValue()).equalsIgnoreCase("sqm") ));
        }
        else if (id == 22)
        {
            value = (java.math.BigDecimal)(((java.math.BigDecimal)field_area.getValue()));
        }
        else if (id == 23)
        {
            value = (java.lang.String)(jesbert);
        }
        else if (id == 24)
        {
            value = (java.math.BigDecimal)(((java.math.BigDecimal)field_assessedvalue.getValue()));
        }
        else if (id == 25)
        {
            value = (java.lang.String)(((java.lang.String)field_areatype.getValue()));
        }
        else if (id == 26)
        {
            value = (java.lang.Boolean)(((java.lang.Number)field_taxable.getValue()) == 0);
        }
        else if (id == 27)
        {
            value = (java.math.BigDecimal)(((java.math.BigDecimal)field_marketvalue.getValue()));
        }
        else if (id == 28)
        {
            value = (java.lang.Boolean)(new Boolean( ((java.lang.Integer)field_mixedarea.getValue()).intValue() == 0 && ((java.lang.String)field_areatype.getValue()).equalsIgnoreCase("sqm") ));
        }
        else if (id == 29)
        {
            value = (java.math.BigDecimal)(((java.math.BigDecimal)variable_TOTALAREASQM.getValue()));
        }
        else if (id == 30)
        {
            value = (java.lang.Boolean)(new Boolean( ((java.lang.Integer)field_mixedarea.getValue()).intValue() == 0 && ((java.lang.String)field_areatype.getValue()).equalsIgnoreCase("ha") ));
        }
        else if (id == 31)
        {
            value = (java.math.BigDecimal)(((java.math.BigDecimal)variable_TOTALAREAHA.getValue()));
        }
        else if (id == 32)
        {
            value = (java.lang.Boolean)(new Boolean( ((java.lang.Integer)field_mixedarea.getValue()).intValue() == 1 ));
        }
        else if (id == 33)
        {
            value = (java.math.BigDecimal)(((java.math.BigDecimal)variable_TOTALAREASQM.getValue()));
        }
        else if (id == 34)
        {
            value = (java.math.BigDecimal)(((java.math.BigDecimal)variable_TOTALMV.getValue()));
        }
        else if (id == 35)
        {
            value = (java.math.BigDecimal)(((java.math.BigDecimal)variable_TOTALAV.getValue()));
        }
        else if (id == 36)
        {
            value = (java.lang.String)(((java.lang.Integer)field_mixedarea.getValue()).intValue() == 1 ? "sqm" : ((java.lang.String)field_areatype.getValue()));
        }

        return value;
    }


    /**
     *
     */
    Object evaluateOld(int id)
    {
        Object value = null;

        if (id == 0)
        {
            value = (java.lang.Integer)(new Integer(1));
        }
        else if (id == 1)
        {
            value = (java.lang.Integer)(new Integer(1));
        }
        else if (id == 2)
        {
            value = (java.lang.Integer)(new Integer(1));
        }
        else if (id == 3)
        {
            value = (java.lang.Integer)(new Integer(0));
        }
        else if (id == 4)
        {
            value = (java.lang.Integer)(new Integer(1));
        }
        else if (id == 5)
        {
            value = (java.lang.Integer)(new Integer(0));
        }
        else if (id == 6)
        {
            value = (java.lang.Integer)(new Integer(1));
        }
        else if (id == 7)
        {
            value = (java.lang.Integer)(new Integer(0));
        }
        else if (id == 8)
        {
            value = (java.math.BigDecimal)((((java.lang.Number)field_taxable.getOldValue()) == 1 ? ((java.math.BigDecimal)field_marketvalue.getOldValue()) : 0.0));
        }
        else if (id == 9)
        {
            value = (java.math.BigDecimal)(BigDecimal.ZERO);
        }
        else if (id == 10)
        {
            value = (java.math.BigDecimal)(((java.math.BigDecimal)field_assessedvalue.getOldValue()));
        }
        else if (id == 11)
        {
            value = (java.math.BigDecimal)(BigDecimal.ZERO);
        }
        else if (id == 12)
        {
            value = (java.math.BigDecimal)(((java.math.BigDecimal)field_areasqm.getOldValue()));
        }
        else if (id == 13)
        {
            value = (java.math.BigDecimal)(((java.math.BigDecimal)field_areasqm.getOldValue()));
        }
        else if (id == 14)
        {
            value = (java.math.BigDecimal)(((java.math.BigDecimal)field_areaha.getOldValue()));
        }
        else if (id == 15)
        {
            value = (java.lang.Boolean)(((java.lang.Number)field_taxable.getOldValue()) == 1);
        }
        else if (id == 16)
        {
            value = (java.math.BigDecimal)(((java.math.BigDecimal)field_marketvalue.getOldValue()));
        }
        else if (id == 17)
        {
            value = (java.lang.Boolean)(new Boolean(((java.lang.String)field_areatype.getOldValue()).equalsIgnoreCase("ha") ));
        }
        else if (id == 18)
        {
            value = (java.math.BigDecimal)(((java.math.BigDecimal)field_area.getOldValue()));
        }
        else if (id == 19)
        {
            value = (java.lang.String)(((java.lang.String)field_classcode.getOldValue()));
        }
        else if (id == 20)
        {
            value = (java.lang.String)(((java.lang.String)field_actualusecode.getOldValue()));
        }
        else if (id == 21)
        {
            value = (java.lang.Boolean)(new Boolean(((java.lang.String)field_areatype.getOldValue()).equalsIgnoreCase("sqm") ));
        }
        else if (id == 22)
        {
            value = (java.math.BigDecimal)(((java.math.BigDecimal)field_area.getOldValue()));
        }
        else if (id == 23)
        {
            value = (java.lang.String)(jesbert);
        }
        else if (id == 24)
        {
            value = (java.math.BigDecimal)(((java.math.BigDecimal)field_assessedvalue.getOldValue()));
        }
        else if (id == 25)
        {
            value = (java.lang.String)(((java.lang.String)field_areatype.getOldValue()));
        }
        else if (id == 26)
        {
            value = (java.lang.Boolean)(((java.lang.Number)field_taxable.getOldValue()) == 0);
        }
        else if (id == 27)
        {
            value = (java.math.BigDecimal)(((java.math.BigDecimal)field_marketvalue.getOldValue()));
        }
        else if (id == 28)
        {
            value = (java.lang.Boolean)(new Boolean( ((java.lang.Integer)field_mixedarea.getOldValue()).intValue() == 0 && ((java.lang.String)field_areatype.getOldValue()).equalsIgnoreCase("sqm") ));
        }
        else if (id == 29)
        {
            value = (java.math.BigDecimal)(((java.math.BigDecimal)variable_TOTALAREASQM.getOldValue()));
        }
        else if (id == 30)
        {
            value = (java.lang.Boolean)(new Boolean( ((java.lang.Integer)field_mixedarea.getOldValue()).intValue() == 0 && ((java.lang.String)field_areatype.getOldValue()).equalsIgnoreCase("ha") ));
        }
        else if (id == 31)
        {
            value = (java.math.BigDecimal)(((java.math.BigDecimal)variable_TOTALAREAHA.getOldValue()));
        }
        else if (id == 32)
        {
            value = (java.lang.Boolean)(new Boolean( ((java.lang.Integer)field_mixedarea.getOldValue()).intValue() == 1 ));
        }
        else if (id == 33)
        {
            value = (java.math.BigDecimal)(((java.math.BigDecimal)variable_TOTALAREASQM.getOldValue()));
        }
        else if (id == 34)
        {
            value = (java.math.BigDecimal)(((java.math.BigDecimal)variable_TOTALMV.getOldValue()));
        }
        else if (id == 35)
        {
            value = (java.math.BigDecimal)(((java.math.BigDecimal)variable_TOTALAV.getOldValue()));
        }
        else if (id == 36)
        {
            value = (java.lang.String)(((java.lang.Integer)field_mixedarea.getOldValue()).intValue() == 1 ? "sqm" : ((java.lang.String)field_areatype.getOldValue()));
        }

        return value;
    }


    /**
     *
     */
    Object evaluateEstimated(int id)
    {
        Object value = null;

        if (id == 0)
        {
            value = (java.lang.Integer)(new Integer(1));
        }
        else if (id == 1)
        {
            value = (java.lang.Integer)(new Integer(1));
        }
        else if (id == 2)
        {
            value = (java.lang.Integer)(new Integer(1));
        }
        else if (id == 3)
        {
            value = (java.lang.Integer)(new Integer(0));
        }
        else if (id == 4)
        {
            value = (java.lang.Integer)(new Integer(1));
        }
        else if (id == 5)
        {
            value = (java.lang.Integer)(new Integer(0));
        }
        else if (id == 6)
        {
            value = (java.lang.Integer)(new Integer(1));
        }
        else if (id == 7)
        {
            value = (java.lang.Integer)(new Integer(0));
        }
        else if (id == 8)
        {
            value = (java.math.BigDecimal)((((java.lang.Number)field_taxable.getValue()) == 1 ? ((java.math.BigDecimal)field_marketvalue.getValue()) : 0.0));
        }
        else if (id == 9)
        {
            value = (java.math.BigDecimal)(BigDecimal.ZERO);
        }
        else if (id == 10)
        {
            value = (java.math.BigDecimal)(((java.math.BigDecimal)field_assessedvalue.getValue()));
        }
        else if (id == 11)
        {
            value = (java.math.BigDecimal)(BigDecimal.ZERO);
        }
        else if (id == 12)
        {
            value = (java.math.BigDecimal)(((java.math.BigDecimal)field_areasqm.getValue()));
        }
        else if (id == 13)
        {
            value = (java.math.BigDecimal)(((java.math.BigDecimal)field_areasqm.getValue()));
        }
        else if (id == 14)
        {
            value = (java.math.BigDecimal)(((java.math.BigDecimal)field_areaha.getValue()));
        }
        else if (id == 15)
        {
            value = (java.lang.Boolean)(((java.lang.Number)field_taxable.getValue()) == 1);
        }
        else if (id == 16)
        {
            value = (java.math.BigDecimal)(((java.math.BigDecimal)field_marketvalue.getValue()));
        }
        else if (id == 17)
        {
            value = (java.lang.Boolean)(new Boolean(((java.lang.String)field_areatype.getValue()).equalsIgnoreCase("ha") ));
        }
        else if (id == 18)
        {
            value = (java.math.BigDecimal)(((java.math.BigDecimal)field_area.getValue()));
        }
        else if (id == 19)
        {
            value = (java.lang.String)(((java.lang.String)field_classcode.getValue()));
        }
        else if (id == 20)
        {
            value = (java.lang.String)(((java.lang.String)field_actualusecode.getValue()));
        }
        else if (id == 21)
        {
            value = (java.lang.Boolean)(new Boolean(((java.lang.String)field_areatype.getValue()).equalsIgnoreCase("sqm") ));
        }
        else if (id == 22)
        {
            value = (java.math.BigDecimal)(((java.math.BigDecimal)field_area.getValue()));
        }
        else if (id == 23)
        {
            value = (java.lang.String)(jesbert);
        }
        else if (id == 24)
        {
            value = (java.math.BigDecimal)(((java.math.BigDecimal)field_assessedvalue.getValue()));
        }
        else if (id == 25)
        {
            value = (java.lang.String)(((java.lang.String)field_areatype.getValue()));
        }
        else if (id == 26)
        {
            value = (java.lang.Boolean)(((java.lang.Number)field_taxable.getValue()) == 0);
        }
        else if (id == 27)
        {
            value = (java.math.BigDecimal)(((java.math.BigDecimal)field_marketvalue.getValue()));
        }
        else if (id == 28)
        {
            value = (java.lang.Boolean)(new Boolean( ((java.lang.Integer)field_mixedarea.getValue()).intValue() == 0 && ((java.lang.String)field_areatype.getValue()).equalsIgnoreCase("sqm") ));
        }
        else if (id == 29)
        {
            value = (java.math.BigDecimal)(((java.math.BigDecimal)variable_TOTALAREASQM.getEstimatedValue()));
        }
        else if (id == 30)
        {
            value = (java.lang.Boolean)(new Boolean( ((java.lang.Integer)field_mixedarea.getValue()).intValue() == 0 && ((java.lang.String)field_areatype.getValue()).equalsIgnoreCase("ha") ));
        }
        else if (id == 31)
        {
            value = (java.math.BigDecimal)(((java.math.BigDecimal)variable_TOTALAREAHA.getEstimatedValue()));
        }
        else if (id == 32)
        {
            value = (java.lang.Boolean)(new Boolean( ((java.lang.Integer)field_mixedarea.getValue()).intValue() == 1 ));
        }
        else if (id == 33)
        {
            value = (java.math.BigDecimal)(((java.math.BigDecimal)variable_TOTALAREASQM.getEstimatedValue()));
        }
        else if (id == 34)
        {
            value = (java.math.BigDecimal)(((java.math.BigDecimal)variable_TOTALMV.getEstimatedValue()));
        }
        else if (id == 35)
        {
            value = (java.math.BigDecimal)(((java.math.BigDecimal)variable_TOTALAV.getEstimatedValue()));
        }
        else if (id == 36)
        {
            value = (java.lang.String)(((java.lang.Integer)field_mixedarea.getValue()).intValue() == 1 ? "sqm" : ((java.lang.String)field_areatype.getValue()));
        }

        return value;
    }


}