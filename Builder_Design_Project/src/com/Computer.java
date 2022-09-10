package com;

public class Computer {
	
	private String RAM;
	private String HDD;
	private String CPU;
	
	private boolean isGraphicsCardEnabled;
	private boolean isBluetoothEnabled;
	
	private Computer(Builder builder) {
		this.HDD = builder.HDD;
		this.RAM = builder.RAM;
		this.CPU = builder.CPU;
		this.isBluetoothEnabled = builder.isBluetoothEnabled;
		this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
	}
	public String getRAM() {
		return RAM;
	}
	public String getHDD() {
		return HDD;
	}
	public String getCPU() {
		return CPU;
	}
	public boolean isGraphicsCardEnabled() {
		return isGraphicsCardEnabled;
	}
	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}

	public static class Builder{
		private String RAM;
		private String HDD;
		private String CPU;
		
		private boolean isGraphicsCardEnabled;
		private boolean isBluetoothEnabled;
		
		public Builder(String rAM, String hDD, String cPU) {
			super();
			RAM = rAM;
			HDD = hDD;
			CPU = cPU;
		}

		public void setRAM(String rAM) {
			RAM = rAM;
		}

		public void setHDD(String hDD) {
			HDD = hDD;
		}

		public void setCPU(String cPU) {
			CPU = cPU;
		}

		public Builder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
			this.isGraphicsCardEnabled = isGraphicsCardEnabled;
			return this;
		}

		public Builder setBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}
		
		public Computer build() {
			return new Computer(this);
		}
	}
}
