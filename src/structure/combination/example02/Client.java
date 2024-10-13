package structure.combination.example02;

/**
 * @description:
 * @author: shengaojie
 * @create: 2023-12-15
 **/

public class Client {
    public static void main(String[] args) {

        ConcreteCompany company2 = new ConcreteCompany("南京办事处", 4);
        FiscalDepartment fiscalDepartment2 = new FiscalDepartment("南京办事处财务部门", 6);
        HRDepartment hrDepartment2 = new HRDepartment("南京办事处人力资源部门", 6);
        company2.add(fiscalDepartment2);
        company2.add(hrDepartment2);

        ConcreteCompany company3 = new ConcreteCompany("杭州办事处", 4);
        FiscalDepartment fiscalDepartment3 = new FiscalDepartment("杭州办事处财务部门", 6);
        HRDepartment hrDepartment3 = new HRDepartment("杭州办事处人力资源部门", 6);
        company3.add(fiscalDepartment3);
        company3.add(hrDepartment3);



        ConcreteCompany company1 = new ConcreteCompany("上海东华分公司", 2);
        FiscalDepartment fiscalDepartment1 = new FiscalDepartment("东华分公司财务部门", 4);
        HRDepartment hrDepartment1 = new HRDepartment("东华分公司人力资源部门", 4);
        company1.add(fiscalDepartment1);
        company1.add(hrDepartment1);
        company1.add(company2);
        company1.add(company3);


        ConcreteCompany company = new ConcreteCompany("北京总公司", 1);
        FiscalDepartment fiscalDepartment = new FiscalDepartment("总公司财务部门", 2);
        HRDepartment hrDepartment = new HRDepartment("总公司人力资源部门", 2);
        company.add(fiscalDepartment);
        company.add(hrDepartment);
        company.add(company1);

        company.display();






    }
}
