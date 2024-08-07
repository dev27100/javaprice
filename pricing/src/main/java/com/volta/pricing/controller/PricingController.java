package com.volta.pricing.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright (c) 2024 Your Volta Services Pvt Ltd- All rights reserved.
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY,   FITNESS    FOR A PARTICULAR   PURPOSE   AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 * <p>
 * Created by Naveen Kavali on 31/07/24.
 */

@RestController
@RequestMapping("/api/v2")
public class PricingController {

    /**
     *
     * @return
     */
    @GetMapping("/price")
    public String getPrice() {
        return "This is the price service called from y Gateway";
    }

    /**
     * 
     * @return
     */
    @GetMapping("/price/list")
    public String getPriceList() {
        return "This is the price list service called from Kong Gateway";
    }
}
