package work;

/**
 * 临时编写的调用命令
 */
public class Command {
    //对服务对象操作
    //查询所有服务对象
    public static final String SERVICELIST1 = "resource service show '{'name ''{0}'''}' '{' ''{1}'' ''{2}'''}'";

    public static final String SERVICELIST = "resource service show '{'name ''{0}'''}' '{' ''{1}'' ''{2}'''}'";
    //查询单个服务对象
    public static final String SERVICE = "resource service show '{'name ''{0}'''}'";

    public static final String SERVICEADD = "resource  service add name ''{0}'' protocol ''{1}'' '{'port_min ''{2}'''}' '{'port_max''{3}'''}'  '{ 'desc ''{4}'' '}'";

    public static final String SERVICEEDIT = "resource  service modify name  ''{0}'' protocol ''{1}'' '{'port_min ''{2}'''}' '{'port_max''{3}'''}'  '{ 'desc ''{4}'' '}'";

    public static final String SERVICEDELETE = "resource service delete  '{'name ''{0}'''}'";

    public static final String SERVICEGROUP = "resource group_service show '{' name ''{0}'' '}'";

    public static final String SERVICEGROUPLIST = "resource group_service show '{' name ''{0}'' '}' '{' ''{1}''  ''{2}'' '}'";

    public static final String SERVICEGROUPADD = "resource group_service add name ''{0}'' member ''{1}'' '{' desc ''{2}'' '}'";

    public static final String SERVICEGROUPEDIT = "resource group_service modify name ''{0}'' member ''{1}'' '{' desc ''{2}'' '}'";

    public static final String SERVICEGROUPDELETE = "resource group_service delete '{ 'name ''{0}'' '}'";

    public static final String KEYWORD = "resource keyword show  '{' name ''{0}'' '}'";

    public static final String KEYWORDLIST = "resource keyword show  '{' name ''{0}'' '}' '{'''{1}''  ''{2}'' '}'";

    public static final String KEYWORDADD = "resource keyword name ''{0}'' keyword ''{1}''";

    public static final String KEYWORDEDIT = "resource keyword modify name ''{0}'' keyword ''{1}''";

    public static final String KEYWORDDELETE = "resource keyword delete  '{'name ''{0}'''}'";

    public static final String APP = "resource app show '{'name ''{0}'''}' ";

    public static final String APPLIST = "resource app show '{'name ''{0}'''}' '{' ''{1}''  ''{2}'' '}'";

    public static final String APPADD = "resource app add name  ''{0}''  '{'ip ''{1}'' '{'port ''{2}'' '{'domain ''{3}'''}'";

    public static final String APPEDIT = "resource  app modify name ''{0}'' '{'ip''{1}'''}' '{'port ''{2}'''}' '{'domain ''{3}'''}'";

    public static final String APPDELETE = "resource app  delete  '{'name ''{0}'''}'";

    public static final String APPGROUP = "resource group_app show  '{' name ''{0}'' '}' ";

    public static final String APPGROUPLIST = "resource group_app show  '{' name ''{0}'' '}' '{'''{1}''  ''{2}'' '}'";

    public static final String APPGROUPADD = "resource  group_app add  name ''{0}'' member ''{1}'' '{' desc ''{2}'' '}'";

    public static final String APPGROUPEDIT = "resource group_app modify  name ''{0}'' member ''{1}'' '{' desc ''{2}'' '}'";

    public static final String APPGROUPDELETE = "resource group_app delete  '{'name ''{0}'''}'";

    //测试用
    public static final String ITEMELETE = "del item name ''{0}'' ";

    public static final String ITEMELETELIST = "del item all";

    public static final String ITEMSHOW = "show item name ''{0}''";

    public static final String ITEMSHOWALL = "show item";

    public static final String ITEMADD = "add item name ''{0}''  value ''{1}''  desc ''{2}''  ";

    public static final String ITEMADD2 = "add item name ''{0}'' ";






}
