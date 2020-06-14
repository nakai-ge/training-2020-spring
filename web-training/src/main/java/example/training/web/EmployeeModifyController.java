package example.training.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import example.training.model.department.DepartmentList;
import example.training.model.employee.Employee;
import example.training.service.department.DepartmentService;
import example.training.service.employee.EmployeeService;

@Controller
@RequestMapping("employee/modify")
public class EmployeeModifyController {

	@Autowired
	private DepartmentService departmentService;
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("{employeeId:\\d+}")
	public String form(@PathVariable Integer employeeId,
			Model model) {
		Employee employee = employeeService.findById(employeeId);
		DepartmentList departmentList = departmentService.listOf();
		model.addAttribute("employee", employee);
		model.addAttribute("departmentList", departmentList);
		return "employee/modify/form";
	}

	@PostMapping
	public String confirm(@Validated @ModelAttribute Employee employee,
			BindingResult result,
			Model model) {
		DepartmentList departmentList = departmentService.listOf();
		model.addAttribute("employee", employee);
		model.addAttribute("departmentList", departmentList);
		if(result.hasErrors())
			return "employee/modify/form";
		return "employee/modify/confirm";
	}

	@PostMapping("execute")
	public String modify(@ModelAttribute Employee employee) {
		employeeService.modify(employee);
		return "redirect:/employee/" + employee.getId().getValue();
	}
}
