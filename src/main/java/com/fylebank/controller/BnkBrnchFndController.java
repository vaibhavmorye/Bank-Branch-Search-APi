package com.fylebank.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fylebank.model.Bank;
import com.fylebank.model.Branches;
import com.fylebank.model.DTO.BranchDTO;
import com.fylebank.repository.BankRepository;
import com.fylebank.repository.BranchRepository;

@RestController
public class BnkBrnchFndController {

	@Autowired
	private BankRepository bankRepository;

	@Autowired
	private BranchRepository branchRepository;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public Optional<Bank> getAllBanks(@RequestParam(value = "id") Long id) {

		Optional<Bank> bank = bankRepository.findById(id);

		return bank;
	}

	@RequestMapping(value = "/bank", method = RequestMethod.GET)
	public List<Branches> getAllBanksCity(@RequestParam(value = "bank_name") String bank_name,
			@RequestParam(value = "bank_city") String bank_city) {
		ArrayList<Branches> branches = new ArrayList<Branches>();
		List<Object[]> objectBranch = branchRepository.findBranchesByCity(bank_name, bank_city);
		for (Object[] branch : objectBranch) {
			Branches temp = new Branches(Long.parseLong(branch[0].toString()), (String) branch[1], (String) branch[2],
					(String) branch[3], (String) branch[4], (String) branch[5], (String) branch[6]);
			branches.add(temp);
		}
		return branches;
	}
	/*
	 * @RequestMapping(value="/get-all-ifsc", method= RequestMethod.GET) public
	 * List<Map<String, Object>> getallifsc(){ Branches branch =
	 * branchRepository.findByifsc(ifsc);
	 * 
	 * return null; }
	 */

	@RequestMapping(value = "/find-branch", method = RequestMethod.GET)
	public Branches/* Map<String, Object> */ getBranchFromIFSC(@RequestParam(value = "ifsc") final String ifsc) {
		/*
		 * Map<String, Object> branch_data = new HashMap<String, Object>(); Branches
		 * branch = branchRepository.findByifsc(id); System.out.println("branch name" +
		 * branch.getBranch()); branch_data.put("Bank_id", branch.getBank_id());
		 * branch_data.put("Branch", branch.getBranch()); branch_data.put("Address",
		 * branch.getAddress()); branch_data.put("city", branch.getCity());
		 * branch_data.put("District", branch.getDistrict()); branch_data.put("State",
		 * branch.getState());
		 */
		return branchRepository.findByifsc(ifsc);
	}

}
